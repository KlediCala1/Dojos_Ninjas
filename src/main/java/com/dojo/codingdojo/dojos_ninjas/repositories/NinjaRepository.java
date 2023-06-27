package com.dojo.codingdojo.dojos_ninjas.repositories;

import com.dojo.codingdojo.dojos_ninjas.models.Ninja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
    List<Ninja> findAll();
}