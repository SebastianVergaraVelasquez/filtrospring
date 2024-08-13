package com.spring.filtrospring.persistence.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cities")
public class City {

    @Id
    private String codeCity;
    private String nameCity;

    @ManyToOne
    @JoinColumn(name = "coderegion")
    private Region region;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "city")
    private List<Customer> customers;

    public City() {
        customers = new ArrayList<>();
    }

    public City(String codeCity, String nameCity, Region region, List<Customer> customers) {
        this.codeCity = codeCity;
        this.nameCity = nameCity;
        this.region = region;
        this.customers = customers;
    }

    public String getCodeCity() {
        return codeCity;
    }

    public void setCodeCity(String codeCity) {
        this.codeCity = codeCity;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
