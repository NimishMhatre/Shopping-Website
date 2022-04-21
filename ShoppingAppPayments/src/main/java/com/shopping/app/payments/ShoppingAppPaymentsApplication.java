package com.shopping.app.payments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class ShoppingAppPaymentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingAppPaymentsApplication.class, args);
	}

}
