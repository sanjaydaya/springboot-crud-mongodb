package com.example.springcrudmongo.repository;

import com.example.springcrudmongo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    // Custom query methods (if needed) can be defined here.
}
