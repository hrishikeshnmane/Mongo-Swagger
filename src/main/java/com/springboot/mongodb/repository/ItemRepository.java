package com.springboot.mongodb.repository;

import com.springboot.mongodb.model.GroceryItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<GroceryItem, String> {


}
