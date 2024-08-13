package com.example.filtroSpringBoot.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "unitmeasurement")
public class UnitMeasurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_um")
    private String NameUm;

    public UnitMeasurement() {
    }

    public UnitMeasurement(String nameUm) {
        NameUm = nameUm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameUm() {
        return NameUm;
    }

    public void setNameUm(String nameUm) {
        NameUm = nameUm;
    }

    @Override
    public String toString() {
        return "UnitMeasurement{" +
                "id=" + id +
                ", NameUm='" + NameUm + '\'' +
                '}';
    }
}
