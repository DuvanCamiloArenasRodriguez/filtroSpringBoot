package com.example.filtroSpringBoot.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "labatory")
public class Labatory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_lab")
    private String nameLab;

    @ManyToOne
    @JoinColumn(name = "code_city_reg")
    private City codeCityReg;

    public Labatory() {
    }

    public Labatory(String nameLab) {
        this.nameLab = nameLab;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameLab() {
        return nameLab;
    }

    public void setNameLab(String nameLab) {
        this.nameLab = nameLab;
    }

    public City getCodeCityReg() {
        return codeCityReg;
    }

    public void setCodeCityReg(City codeCityReg) {
        this.codeCityReg = codeCityReg;
    }

    @Override
    public String toString() {
        return "Labatory{" +
                "id=" + id +
                ", nameLab='" + nameLab + '\'' +
                ", codeCityReg=" + codeCityReg +
                '}';
    }
}
