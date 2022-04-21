package com.shopping.app.users.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shopping.app.users.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {

}
