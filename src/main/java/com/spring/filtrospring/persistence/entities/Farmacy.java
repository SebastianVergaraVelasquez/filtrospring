package com.spring.filtrospring.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pharmacies")
public class Farmacy {

    @Id
    private int id;

    private String name;
    private String address;
    private Double lon;
    private Double lat;
    private String logo;

    @ManyToOne
    private City city;

    public Farmacy() {
    }

    public Farmacy(int id, String name, String address, Double lon, Double lat, String logo, City city) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.lon = lon;
        this.lat = lat;
        this.logo = logo;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
