    package com.lambdaschool.zoo.controllers;

import com.lambdaschool.zoo.services.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZooController {

    @Autowired
    private ZooService zooService;

    @GetMapping(value = "/zoo", produces = {"application/json"})
    public ResponseEntity<?> getZoos()
    {
        return new ResponseEntity<>(zooService.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/animal/count", produces = {"application/json"})
    public ResponseEntity<?> getAnimalsPerZoo()
    {
        return new ResponseEntity<>(zooService.getCountAnimalsPerZoo(), HttpStatus.OK);
    }
}
