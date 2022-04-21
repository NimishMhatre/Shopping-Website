package com.shopping.app.payments.controller;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.app.payments.model.Payment;
import com.shopping.app.payments.repository.PaymentRepository;


@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	private PaymentRepository repository;
	
	public String paymentProcessing() {
		return new Random().nextBoolean()?"success":"failed";
	}
	
	@PostMapping("/doPayment")
	public Payment doPaymnet(@RequestBody Payment payment) {
		payment.setId(UUID.randomUUID().toString());
		payment.setPaymentStatus(paymentProcessing());
		payment.setTransactionId(UUID.randomUUID().toString());
		return repository.save(payment);
	}

}
