package com.spring.filtrospring.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "mode_admins")
public class ModeAdministration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;

    public ModeAdministration() {
    }

    public ModeAdministration(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
