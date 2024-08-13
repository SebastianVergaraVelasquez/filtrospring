package com.spring.filtrospring.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    private String id;
    private String name;
    private String lastname;

    @ManyToOne
    @JoinColumn(name = "codecity")
    private City city;

    private String email;
    private Date birthdate;
    private Double lon;
    private Double lat;

    public Customer() {
    }

    public Customer(String id, String name, String lastname, City city, String email, Date birthdate, Double lon, Double lat) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.city = city;
        this.email = email;
        this.birthdate = birthdate;
        this.lon = lon;
        this.lat = lat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
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
}
