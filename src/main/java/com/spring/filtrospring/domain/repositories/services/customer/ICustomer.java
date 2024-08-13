package com.spring.filtrospring.domain.repositories.services.customer;

import com.spring.filtrospring.persistence.entities.Customer;
import com.spring.filtrospring.persistence.entities.CustomerDTO;

import java.util.List;
import java.util.Optional;

public interface ICustomer {
    List<Customer> findAll();
    Optional<Customer> findById(String id);
    Customer save(CustomerDTO customer);
    Optional<Customer> update(String idCustomer, CustomerDTO customer);

    void delete(Customer customer);

}
