package com.dojo.codingdojo.dojos_ninjas.repositories;

import com.dojo.codingdojo.dojos_ninjas.models.Dojo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {
    List<Dojo> findAll();
}