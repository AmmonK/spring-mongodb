package com.example.demo;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface FruitRepository extends MongoRepository<Fruit, String> {

}
