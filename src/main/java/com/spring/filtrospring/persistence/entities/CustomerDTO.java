package com.spring.filtrospring.persistence.entities;


public class CustomerDTO {
    private Customer customer;
    private String cityCode;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
}
