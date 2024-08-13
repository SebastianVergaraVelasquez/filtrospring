package com.spring.filtrospring.domain.repositories.services.customer;

import com.spring.filtrospring.domain.repositories.CustomerRepository;
import com.spring.filtrospring.persistence.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerImpl implements ICustomer {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public List<Customer> findAll() {
        return customerRepository.findCustomerDetail();
    }

    @Override
    public Optional<Customer> findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> update(int idCustomer, Customer customer) {
        Customer savedCustomer = customerRepository.save(customer);
        return Optional.of(savedCustomer);
    }

    @Override
    public void delete(Customer customer) {
        customerRepository.delete(customer);
        return;
    }
}
