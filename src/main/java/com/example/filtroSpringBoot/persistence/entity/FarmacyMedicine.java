package com.example.filtroSpringBoot.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "farmacymedicine")
public class FarmacyMedicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String price;

    @ManyToOne
    @JoinColumn(name = "id_farmacy")
    private Farmacy idFarmacy;

    @ManyToOne
    @JoinColumn(name = "id_medicine_fatrm")
    private Medicine idMedicineFatrm;

    public FarmacyMedicine() {
    }

    public FarmacyMedicine(String price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Farmacy getIdFarmacy() {
        return idFarmacy;
    }

    public void setIdFarmacy(Farmacy idFarmacy) {
        this.idFarmacy = idFarmacy;
    }

    public Medicine getIdMedicineFatrm() {
        return idMedicineFatrm;
    }

    public void setIdMedicineFatrm(Medicine idMedicineFatrm) {
        this.idMedicineFatrm = idMedicineFatrm;
    }

    @Override
    public String toString() {
        return "FarmacyMedicine{" +
                "id=" + id +
                ", price='" + price + '\'' +
                ", idFarmacy=" + idFarmacy +
                ", idMedicineFatrm=" + idMedicineFatrm +
                '}';
    }
}
