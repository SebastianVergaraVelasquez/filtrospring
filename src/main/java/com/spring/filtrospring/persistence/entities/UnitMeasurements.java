package com.spring.filtrospring.persistence.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "unit_measurements")
public class UnitMeasurements {

    @Id
    private int id;

    private String name;

    public UnitMeasurements() {
    }

    public UnitMeasurements(int id, String name) {
        this.id = id;
        this.name = name;
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
}
