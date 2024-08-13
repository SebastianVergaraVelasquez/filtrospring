package com.spring.filtrospring.persistence.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "medicines")
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String proceedings;
    private String name;
    private String healthRegister;
    private String description;
    private String shortDescription;

    @ManyToOne
    private ModeAdministration modeAdministration;

    @ManyToOne
    private ActivePrinciple activePrinciple;

    @ManyToOne
    private UnitMeasurements unitMeasurements;

    @ManyToOne
    private Laboratory laboratory;

    public Medicine() {
    }

    public Medicine(int id, String proceedings, String name, String healthRegister, String description, String shortDescription, ModeAdministration modeAdministration, ActivePrinciple activePrinciple, UnitMeasurements unitMeasurements, Laboratory laboratory) {
        this.id = id;
        this.proceedings = proceedings;
        this.name = name;
        this.healthRegister = healthRegister;
        this.description = description;
        this.shortDescription = shortDescription;
        this.modeAdministration = modeAdministration;
        this.activePrinciple = activePrinciple;
        this.unitMeasurements = unitMeasurements;
        this.laboratory = laboratory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProceedings() {
        return proceedings;
    }

    public void setProceedings(String proceedings) {
        this.proceedings = proceedings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHealthRegister() {
        return healthRegister;
    }

    public void setHealthRegister(String healthRegister) {
        this.healthRegister = healthRegister;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public ModeAdministration getModeAdministration() {
        return modeAdministration;
    }

    public void setModeAdministration(ModeAdministration modeAdministration) {
        this.modeAdministration = modeAdministration;
    }

    public ActivePrinciple getActivePrinciple() {
        return activePrinciple;
    }

    public void setActivePrinciple(ActivePrinciple activePrinciple) {
        this.activePrinciple = activePrinciple;
    }

    public UnitMeasurements getUnitMeasurements() {
        return unitMeasurements;
    }

    public void setUnitMeasurements(UnitMeasurements unitMeasurements) {
        this.unitMeasurements = unitMeasurements;
    }

    public Laboratory getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(Laboratory laboratory) {
        this.laboratory = laboratory;
    }
}
