package com.shopping.app.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@SpringBootApplication
@EnableDiscoveryClient
public class ShoppingAppUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingAppUsersApplication.class, args);
	}

}
