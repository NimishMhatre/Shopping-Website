package com.shopping.app.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;




@SpringBootApplication
@EnableDiscoveryClient
public class ShoppingAppOrdersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingAppOrdersApplication.class, args);
	}
	
}
