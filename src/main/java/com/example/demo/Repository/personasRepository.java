package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.personasModel;


public interface personasRepository extends CrudRepository<personasModel, Integer> {

}
