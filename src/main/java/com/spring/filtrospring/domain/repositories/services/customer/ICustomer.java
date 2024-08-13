package com.spring.filtrospring.domain.repositories.services.customer;

import com.spring.filtrospring.persistence.entities.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomer {
    List<Customer> findAll();
    Optional<Customer> findById(int id);
    Customer save(Customer customer);
    Optional<Customer> update(int idCustomer, Customer customer);
    void delete(Customer customer);

}
