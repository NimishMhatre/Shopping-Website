package com.shopping.app.orders.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.app.orders.model.Order;
import com.shopping.app.orders.model.OrderReview;
import com.shopping.app.orders.repository.OrderRepository;
import com.shopping.app.orders.repository.ReviewRepository;


@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderRepository repository;
	
	@Autowired
	private ReviewRepository repo;
	
	@PostMapping("/bookOrder")
	public Order bookOrder(@RequestBody Order order) {
		return repository.save(order);
	}
	
	@PostMapping("/order/review")
	public OrderReview addReview(@RequestBody OrderReview orderReview) {
		orderReview.setId(UUID.randomUUID().toString());
		return repo.save(orderReview);
	}

	@GetMapping("/getAllOrders")
	public List<Order> getOrders(){
		return repository.findAll();
	}
	
	@GetMapping("/getOrders/{userid}")
	public List<Order> getById(@PathVariable int userid){
		return repository.findByUserid(userid);
	}
	
}
