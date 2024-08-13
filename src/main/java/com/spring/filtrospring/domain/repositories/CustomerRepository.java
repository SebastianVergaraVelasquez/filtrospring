package com.spring.filtrospring.domain.repositories;

import com.spring.filtrospring.persistence.entities.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, String> {

    @Query("SELECT c FROM Customer c JOIN FETCH c.city")
    List<Customer> findCustomerDetail();
}
