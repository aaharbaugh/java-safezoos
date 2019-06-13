package com.lambdaschool.zoo.repos;

import com.lambdaschool.zoo.models.Zoo;
import com.lambdaschool.zoo.views.CountAnimalsPerZoo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ZooRepository extends CrudRepository<Zoo, Long> {

    //SELECT z.animalid, a.animalname, count(z.zooid) as countanimals
    //FROM zooanimals z
    //INNER JOIN animals a on z.animalid = z.animalid GROUP BY a.animalid, a.animalname
    @Query(value =
            "SELECT z.animalid, a.animaltype, count(z.zooid) as countanimals FROM zooanimals z INNER JOIN animal a on z.animalid = a.animalid GROUP BY a.animaltype, z.animalid", nativeQuery = true)
    ArrayList<CountAnimalsPerZoo> getCountAnimalsPerZoo();

}
