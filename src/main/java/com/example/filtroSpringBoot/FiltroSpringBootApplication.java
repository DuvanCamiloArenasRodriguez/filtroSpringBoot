package com.example.filtroSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FiltroSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiltroSpringBootApplication.class, args);
	}

}








@Entity
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "address_line1", length = 50)
	private String addressLine1;

	//    Esta puede estar en blanco
	@Column(name = "address_line2", length = 50)
	private String addressLine2;

	@ManyToOne
	@JoinColumn(name = "city_code_d")
	private City city;

	public Address() {
	}

	public Address(String addressLine1, String addressLine2) {
		this();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address{" +
				"id=" + id +
				", addressLine1='" + addressLine1 + '\'' +
				", addressLine2='" + addressLine2 + '\'' +
				'}';
	}
}





public interface CustomerRepository extends CrudRepository<Customer, Long> {
	//FILTRO DE CLIENTE POR CIUDAD
	@Query("SELECT c.id, c.firstName, c.lastName1, c.lastName2, c.email, c.city, c.address, c.salesRep " +
			"FROM Customer c " +
			"WHERE c.city.id = :id")
	List<Object[]> findCustomerDataByCityId(@Param("id") Long id);

	//FILTRO DE CLIENTE POR ESTADO PEDIDO
	@Query("SELECT DISTINCT c.id, c.firstName, c.lastName1, c.lastName2, c.email, c.city, c.address, c.salesRep " +
			"FROM NOrder o " +
			"JOIN o.customerCodeOr c " +
			"JOIN o.statusCodeOr s " +
			"WHERE s.id = 1")
	List<Object[]> findCustomersWithPendingOrders();
}









public interface IAddress {
	List<Address> findAll();
	Optional<Address> findById(Long id);
	Address save(Address address);
	Optional<Address> update(Long id, Address address);
	Optional<Address> delete(Long id);
}






@Service
public class AddressImpl implements IAddress {
	@Autowired
	private AddressRepository repository;

	@Transactional(readOnly = true)
	@Override
	public List<Address> findAll() {
		return (List<Address>) repository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<Address> findById(Long id) {
		return repository.findById(id);
	}

	@Transactional
	@Override
	public Address save(Address address) {
		return repository.save(address);
	}

	@Transactional
	@Override
	public Optional<Address> update(Long id, Address address) {
		Optional<Address> getAddress = repository.findById(id);
		if (getAddress.isPresent()) {
			Address newAddress = getAddress.orElseThrow();
			newAddress.setAddressLine1(address.getAddressLine1());
			newAddress.setAddressLine2(address.getAddressLine2());
			newAddress.setCity(address.getCity());
//            newAddress.setOffices(address.getOffices());
//            newAddress.setCustomers(address.getCustomers());
			return Optional.of(repository.save(newAddress));
		}
		return getAddress;
	}

	@Transactional
	@Override
	public Optional<Address> delete(Long id) {
		Optional<Address> getAddress = repository.findById(id);
		getAddress.ifPresent(repository::delete);
		return getAddress;
	}
}







@RestController
@RequestMapping("/api/addresses")
public class AddressController {

	@Autowired
	private IAddress service;

	@GetMapping
	public List<Address> listAddresses() {
		return service.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Address> view(@PathVariable Long id) {
		Optional<Address> getAddress = service.findById(id);
		if (getAddress.isPresent()) {
			return ResponseEntity.ok(getAddress.orElseThrow());
		}
		return ResponseEntity.notFound().build();
	}

	@PostMapping
	public ResponseEntity<Address> save(@RequestBody Address address) {
		Address data = service.save(address);
		return ResponseEntity.status(HttpStatus.CREATED).body(data);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Address> update(@PathVariable Long id, @RequestBody Address address) {
		Optional<Address> data = service.update(id, address);
		if (data.isPresent()) {
			return ResponseEntity.status(HttpStatus.CREATED).body(data.orElseThrow());
		}
		return ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Address> delete(@PathVariable Long id) {
		Optional<Address> address = service.delete(id);
		if (address.isPresent()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		return ResponseEntity.notFound().build();
	}
}