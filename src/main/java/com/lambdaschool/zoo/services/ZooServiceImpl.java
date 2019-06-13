package com.lambdaschool.zoo.services;

import com.lambdaschool.zoo.models.Zoo;
import com.lambdaschool.zoo.repos.ZooRepository;
import com.lambdaschool.zoo.views.CountAnimalsPerZoo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service(value = "zooService")
public class ZooServiceImpl implements ZooService{

    @Autowired
    private ZooRepository zoorepo;

    @Override
    public ArrayList<Zoo> findAll() {
        ArrayList<Zoo> list = new ArrayList<>();
        zoorepo.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public ArrayList<CountAnimalsPerZoo> getCountAnimalsPerZoo() {
        return zoorepo.getCountAnimalsPerZoo();
    }
}
