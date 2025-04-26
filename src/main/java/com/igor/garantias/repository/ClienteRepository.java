package com.igor.garantias.repository;

import com.igor.garantias.entity.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//todo, findAll(), findById(id), save(obj), deleteById(id)
@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {
}
