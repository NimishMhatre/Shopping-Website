package com.shopping.app.users.repository;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.shopping.app.users.model.Order;
import com.shopping.app.users.model.OrderReview;


@FeignClient(value="orderService", url="http://localhost:9192/orders" )
public interface OrderServiceClient {

	@PostMapping("/bookOrder")
	public Order bookOrder(@RequestBody Order order);
	
	@PostMapping("/order/review")
	public OrderReview addReview(@RequestBody OrderReview orderReview);
	
	@GetMapping("/getOrders/{userid}")
	public List<Order> getById(@PathVariable int userid);
}
