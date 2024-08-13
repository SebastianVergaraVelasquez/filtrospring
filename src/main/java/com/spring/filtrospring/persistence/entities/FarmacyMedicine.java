package com.spring.filtrospring.persistence.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "farmacy_medicine")
public class FarmacyMedicine {
    @EmbeddedId
    private FarmacyMedicineId id;
    private Double price;
}
