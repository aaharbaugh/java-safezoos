package com.lambdaschool.zoo.repos;

import com.lambdaschool.zoo.models.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, Long> {
}