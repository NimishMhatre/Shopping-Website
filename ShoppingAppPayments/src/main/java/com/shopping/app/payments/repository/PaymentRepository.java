package com.shopping.app.payments.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.shopping.app.payments.model.Payment;

public interface PaymentRepository extends MongoRepository<Payment, Integer> {

}
