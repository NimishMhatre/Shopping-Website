package com.shopping.app.orders.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "OrderReview")
public class OrderReview {

	@Id
	private String id;
	private int orderid;
	private String feedback;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "OrderReview [id=" + id + ", orderid=" + orderid + ", feedback=" + feedback + "]";
	}
	
	
	
}
