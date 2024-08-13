package com.spring.filtrospring.web;

import com.spring.filtrospring.domain.repositories.services.customer.ICustomer;
import com.spring.filtrospring.persistence.entities.Customer;
import com.spring.filtrospring.persistence.entities.CustomerDTO;
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
    public Optional<Customer> findById(@PathVariable String id){
        return customerService.findById(id);
    }

    @PostMapping
    public Customer create(@RequestBody CustomerDTO customerDTO){
        return customerService.save(customerDTO);
    }

    @PutMapping("/{id}")
    public Optional<Customer> update(@PathVariable String id, @RequestBody CustomerDTO customerDTO){
        return customerService.update(id,customerDTO);
    }

    @DeleteMapping("/{id}")
    public Customer delete(@PathVariable String id){
        Optional<Customer> customerOpt = customerService.findById(id);
        customerService.delete(customerOpt.get());
        return customerOpt.get() ;
    }
}
