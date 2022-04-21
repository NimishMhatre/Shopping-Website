package com.shopping.app.orders.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shopping.app.orders.model.OrderReview;

public interface ReviewRepository extends MongoRepository<OrderReview, Integer> {

}
