package com.spring.filtrospring.domain.repositories;

import com.spring.filtrospring.persistence.entities.City;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City,String> {
}
