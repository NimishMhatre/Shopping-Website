package com.shopping.app.users.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shopping.app.users.model.Address;

public interface AddressRepository extends MongoRepository<Address, Integer> {

	List<Address> findByUserid(int userid);
}
