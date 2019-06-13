package com.lambdaschool.zoo.repos;

import com.lambdaschool.zoo.models.Telephone;
import org.springframework.data.repository.CrudRepository;

public interface TelephoneRepository extends CrudRepository<Telephone, Long> {
}
