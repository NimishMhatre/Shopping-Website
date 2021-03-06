package com.shopping.app.orders.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.shopping.app.orders.model.Order;

public interface OrderRepository extends MongoRepository<Order, Integer> {

	List<Order> findByUserid(int userid);
}
