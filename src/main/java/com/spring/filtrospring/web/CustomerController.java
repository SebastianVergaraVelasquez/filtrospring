package com.spring.filtrospring.web;

import com.spring.filtrospring.domain.repositories.services.customer.ICustomer;
import com.spring.filtrospring.persistence.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("health/customer")
public class CustomerController {

    @Autowired
    private ICustomer customerService;

    @GetMapping
    public List<Customer> getAll(){
        return customerService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Customer> findById(@PathVariable int id){
        return customerService.findById(id);
    }

    @PostMapping
    public Customer create(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @PutMapping("/{id}")
    public Optional<Customer> update(@PathVariable int id, @RequestBody Customer customer){
        return customerService.update(id,customer);
    }

    @DeleteMapping("/{id}")
    public Customer delete(@PathVariable int id){
        Optional<Customer> customerOpt = customerService.findById(id);
        customerService.delete(customerOpt.get());
        return customerOpt.get() ;
    }
}
