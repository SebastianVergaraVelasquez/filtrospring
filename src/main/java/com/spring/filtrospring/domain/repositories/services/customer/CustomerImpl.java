package com.spring.filtrospring.domain.repositories.services.customer;

import com.spring.filtrospring.domain.repositories.CityRepository;
import com.spring.filtrospring.domain.repositories.CustomerRepository;
import com.spring.filtrospring.persistence.entities.City;
import com.spring.filtrospring.persistence.entities.Customer;
import com.spring.filtrospring.persistence.entities.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerImpl implements ICustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findCustomerDetail();
    }

    @Override
    public Optional<Customer> findById(String id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer save(CustomerDTO customerDTO) {
        Customer customer = customerDTO.getCustomer();
        Optional<City> cityOpt = cityRepository.findById(customerDTO.getCityCode());
        customer.setCity(cityOpt.get());
        return customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> update(String idCustomer, CustomerDTO customerDTO) {
        Customer customer = customerRepository.findById(idCustomer).get();
        Optional<City> cityOpt = cityRepository.findById(customerDTO.getCityCode());
        customer.setCity(cityOpt.get());
        customer.setBirthdate(customerDTO.getCustomer().getBirthdate());
        customer.setEmail(customerDTO.getCustomer().getEmail());
        customer.setName(customerDTO.getCustomer().getName());
        customer.setLastname(customerDTO.getCustomer().getLastname());
        customer.setLat(customerDTO.getCustomer().getLat());
        customer.setLon(customerDTO.getCustomer().getLon());
        Customer savedCustomer = customerRepository.save(customer);
        return Optional.of(savedCustomer);
    }

    @Override
    public void delete(Customer customer) {
        customerRepository.delete(customer);
        return;
    }
}
