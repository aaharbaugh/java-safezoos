package com.lambdaschool.zoo.services;

import com.lambdaschool.zoo.models.Zoo;
import com.lambdaschool.zoo.views.CountAnimalsPerZoo;

import java.util.ArrayList;

public interface ZooService {

    ArrayList<Zoo> findAll();

    void delete(long id);

    ArrayList<CountAnimalsPerZoo> getCountAnimalsPerZoo();

}
