package com.example.filtroSpringBoot.persistence.entity;


import jakarta.persistence.*;


@Entity
@Table(name = "farmacy")
public class Farmacy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_farmacy")
    private String name;

    @Column(name = "address_farmacy")
    private String addressFarmacy;

    @Column(name = "longi")
    private String longitud;

    @Column(name = "lat_farmacy")
    private String latitud;

    @Column(name = "logo_farmacy")
    private String logoFarmacy;

    @ManyToOne
    @JoinColumn(name = "code_city_farm")
    private City codeCityFarm;


}
