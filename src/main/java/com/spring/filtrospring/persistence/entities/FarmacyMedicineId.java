package com.spring.filtrospring.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class FarmacyMedicineId {
    @Column(name = "order_code")
    private String orderCode;

    @Column(name = "product_code")
    private String productCode;

    public FarmacyMedicineId() {
    }
}


