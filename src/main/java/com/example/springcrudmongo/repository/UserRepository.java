package com.example.springcrudmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.springcrudmongo.model.User;

public interface UserRepository extends MongoRepository<User, String> {
}
