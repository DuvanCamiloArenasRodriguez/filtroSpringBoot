package com.example.filtroSpringBoot.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_reg")
    private String nameReg;

    @ManyToOne
    @JoinColumn(name = "code_country")
    private Country codeCountry;

    public Region() {
    }

    public Region(String nameReg) {
        this.nameReg = nameReg;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameReg() {
        return nameReg;
    }

    public void setNameReg(String nameReg) {
        this.nameReg = nameReg;
    }

    public Country getCodeCountry() {
        return codeCountry;
    }

    public void setCodeCountry(Country codeCountry) {
        this.codeCountry = codeCountry;
    }

    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", nameReg='" + nameReg + '\'' +
                ", codeCountry=" + codeCountry +
                '}';
    }
}
