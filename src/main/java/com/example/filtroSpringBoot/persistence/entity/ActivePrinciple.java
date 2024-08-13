package com.example.filtroSpringBoot.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "activeprinciple")
public class ActivePrinciple {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_ap")
    private String nameAp;

    public ActivePrinciple() {
    }

    public ActivePrinciple(String nameAp) {
        this.nameAp = nameAp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameAp() {
        return nameAp;
    }

    public void setNameAp(String nameAp) {
        this.nameAp = nameAp;
    }

    @Override
    public String toString() {
        return "ActivePrinciple{" +
                "id=" + id +
                ", nameAp='" + nameAp + '\'' +
                '}';
    }
}
