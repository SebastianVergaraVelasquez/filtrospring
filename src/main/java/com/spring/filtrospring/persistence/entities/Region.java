package com.spring.filtrospring.persistence.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "regions")
public class Region {

    @Id
    private String codeRegion;
    private String nameRegion;

    @ManyToOne
    private Country country;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "region")
    private List<City> cities;

    public Region() {
        cities = new ArrayList<>();
    }

    public Region(String codeRegion, String nameRegion, Country country, List<City> cities) {
        this.codeRegion = codeRegion;
        this.nameRegion = nameRegion;
        this.country = country;
        this.cities = cities;
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(String codeRegion) {
        this.codeRegion = codeRegion;
    }

    public String getNameRegion() {
        return nameRegion;
    }

    public void setNameRegion(String nameRegion) {
        this.nameRegion = nameRegion;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
