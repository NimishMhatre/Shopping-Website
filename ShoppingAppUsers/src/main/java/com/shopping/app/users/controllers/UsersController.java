package com.shopping.app.users.controllers;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.app.users.model.Address;
import com.shopping.app.users.model.Order;
import com.shopping.app.users.model.OrderReview;
import com.shopping.app.users.model.Payment;
import com.shopping.app.users.model.Product;
import com.shopping.app.users.model.User;
import com.shopping.app.users.repository.AddressRepository;
import com.shopping.app.users.repository.OrderServiceClient;
import com.shopping.app.users.repository.PaymentServiceClient;
import com.shopping.app.users.repository.ProductRepository;
import com.shopping.app.users.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private AddressRepository repo;
	
	@Autowired
	private ProductRepository prodrepo;
	
	@Autowired
	private OrderServiceClient orderClient;
	
	@Autowired
	private PaymentServiceClient paymentClient;
	
	@PostMapping("/register")
	public String registerUser(@RequestBody User user){
		repository.save(user);
		return user.getUserName() + " is registered sucessfully";
	}
	
	@PostMapping("/BookOrder")
	public Order BookOrder(@RequestBody Order order) {
		return orderClient.bookOrder(order);
	}
	
	@PostMapping("/order/review")
	public OrderReview giveReview(@RequestBody OrderReview orderReview) {
		return orderClient.addReview(orderReview);
	}
	
	@GetMapping("/getOrders/{userid}")
	public List<Order> getById(@PathVariable int userid){
		return orderClient.getById(userid);
	}
	
	@PostMapping("/makePayment")
	public Payment makePayment(@RequestBody Payment payment) {
		return paymentClient.doPaymnet(payment);
	}
	
	@PostMapping("/saveAddress")
	public Address saveAddress(@RequestBody Address address) {
		address.setId(UUID.randomUUID().toString());
		repo.save(address);
		return address;
	}
	
	@GetMapping("/Address/{userid}")
	public List<Address> getAddress(@PathVariable int userid){
		return repo.findByUserid(userid);
	}
	
	
	@GetMapping("/getAllUser")
	public List<User> getUser(){
		return repository.findAll();
	}
	
	@PostMapping("/saveProduct")
	public Product saveProduct(@RequestBody Product product) {
		prodrepo.save(product);
		return product;
	}
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		return prodrepo.findAll();
	}
	
	@GetMapping("/getUser/{id}")
	public Optional<User> getUser(@PathVariable int id){
		return repository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		repository.deleteById(id);
		return "User deleted with id : "+ id;
	}

}
