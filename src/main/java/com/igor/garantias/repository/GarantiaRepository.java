package com.igor.garantias.repository;

import com.igor.garantias.entity.Garantia;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//todo, findAll(), findById(id), save(obj), deleteById(id)
@Repository
public interface GarantiaRepository extends MongoRepository<Garantia, String> {
}
