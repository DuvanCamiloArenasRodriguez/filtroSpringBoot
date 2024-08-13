package com.example.filtroSpringBoot.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_city")
    private String nameCity;

    @ManyToOne
    @JoinColumn(name = "code_region")
    private Region codeRegion;
}
