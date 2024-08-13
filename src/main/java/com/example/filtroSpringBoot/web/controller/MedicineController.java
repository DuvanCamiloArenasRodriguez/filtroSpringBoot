package com.example.filtroSpringBoot.web.controller;

import com.example.filtroSpringBoot.domain.service.medicine.IMedicine;
import com.example.filtroSpringBoot.persistence.entity.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/medicines")
public class MedicineController {
    @Autowired
    private IMedicine service;

    @GetMapping
    public List<Medicine> listMedicines() {
        return service.findAll();
    }

    @GetMapping("/{id}")
	public ResponseEntity<Medicine> view(@PathVariable Long id) {
		Optional<Medicine> getMedicine = service.findById(id);
		if (getMedicine.isPresent()) {
			return ResponseEntity.ok(getMedicine.orElseThrow());
		}
		return ResponseEntity.notFound().build();
	}

    @PostMapping
	public ResponseEntity<Medicine> save(@RequestBody Medicine medicine) {
		Medicine data = service.save(medicine);
		return ResponseEntity.status(HttpStatus.CREATED).body(data);
	}

    @PutMapping("/{id}")
	public ResponseEntity<Medicine> update(@PathVariable Long id, @RequestBody Medicine address) {
		Optional<Medicine> data = service.update(id, address);
		if (data.isPresent()) {
			return ResponseEntity.status(HttpStatus.CREATED).body(data.orElseThrow());
		}
		return ResponseEntity.notFound().build();
	}

    @DeleteMapping("/{id}")
	public ResponseEntity<Medicine> delete(@PathVariable Long id) {
		Optional<Medicine> address = service.delete(id);
		if (address.isPresent()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		return ResponseEntity.notFound().build();
	}
}
