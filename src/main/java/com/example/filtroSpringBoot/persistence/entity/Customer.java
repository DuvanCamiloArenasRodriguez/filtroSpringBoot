package com.example.filtroSpringBoot.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_customer")
    private String nameCustomer;

    @Column(name = "lastname_customer")
    private String lastNameCustomer;

    @Column(name = "email_customer")
    private String emailCustomer;

    @Column(name = "birthdate")
    private Date birthDate;

    @Column(name = "lon")
    private String longitud;

    @Column(name = "latitud")
    private String latitud;

    @ManyToOne
    @JoinColumn(name = "code_city_customer")
    private City codeCityCustomer;


    public Customer() {
    }

    public Customer(String nameCustomer, String lastNameCustomer, String emailCustomer, Date birthDate, String longitud, String latitud) {
        this.nameCustomer = nameCustomer;
        this.lastNameCustomer = lastNameCustomer;
        this.emailCustomer = emailCustomer;
        this.birthDate = birthDate;
        this.longitud = longitud;
        this.latitud = latitud;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getLastNameCustomer() {
        return lastNameCustomer;
    }

    public void setLastNameCustomer(String lastNameCustomer) {
        this.lastNameCustomer = lastNameCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public City getCodeCityCustomer() {
        return codeCityCustomer;
    }

    public void setCodeCityCustomer(City codeCityCustomer) {
        this.codeCityCustomer = codeCityCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", nameCustomer='" + nameCustomer + '\'' +
                ", lastNameCustomer='" + lastNameCustomer + '\'' +
                ", emailCustomer='" + emailCustomer + '\'' +
                ", birthDate=" + birthDate +
                ", longitud='" + longitud + '\'' +
                ", latitud='" + latitud + '\'' +
                ", codeCityCustomer=" + codeCityCustomer +
                '}';
    }
}
