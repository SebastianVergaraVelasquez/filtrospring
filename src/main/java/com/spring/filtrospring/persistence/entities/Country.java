package com.spring.filtrospring.persistence.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "countries")
public class Country {

    @Id
    private String codeCountry;
    private String nameCountry;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "country")
    private List<Region> regions;

    public Country() {
        regions = new ArrayList<>();
    }

    public Country(String codeCountry, String nameCountry, List<Region> regions) {
        this.codeCountry = codeCountry;
        this.nameCountry = nameCountry;
        this.regions = regions;
    }

    public String getCodeCountry() {
        return codeCountry;
    }

    public void setCodeCountry(String codeCountry) {
        this.codeCountry = codeCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }
}
