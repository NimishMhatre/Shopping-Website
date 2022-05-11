package com.shopping.app.users.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.shopping.app.users.model.Payment;



@FeignClient(value="paymentService", url="http://localhost:9191/payment" )
public interface PaymentServiceClient {

	@PostMapping("/doPayment")
	public Payment doPaymnet(@RequestBody Payment payment);
}
