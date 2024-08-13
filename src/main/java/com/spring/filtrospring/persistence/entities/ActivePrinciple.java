package com.spring.filtrospring.persistence.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "active_principles")
public class ActivePrinciple {

    @Id
    private int id;

    private String name;

    public ActivePrinciple() {
    }

    public ActivePrinciple(int id, String name) {
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
