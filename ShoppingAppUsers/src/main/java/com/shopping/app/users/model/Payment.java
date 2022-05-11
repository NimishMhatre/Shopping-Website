package com.shopping.app.users.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Payment")
public class Payment {
	
	@Id
	private String id;
	private String paymentStatus;
	private String transactionId;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	@Override
	public String toString() {
		return "Payment [id=" + id + ", paymentStatus=" + paymentStatus + ", transactionId=" + transactionId + "]";
	}
	
	
	
	
}
