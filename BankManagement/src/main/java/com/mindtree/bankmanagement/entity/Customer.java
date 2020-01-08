package com.mindtree.bankmanagement.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String customerName;
	private int age;
	@OneToMany
	private Set<DebitCard> debitCards;

	public Customer() {
		super();
	}

	public Customer(int customerId, String customerName, int age, Set<DebitCard> debitCards) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.age = age;
		this.debitCards = debitCards;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Set<DebitCard> getDebitCards() {
		return debitCards;
	}

	public void setDebitCards(Set<DebitCard> debitCards) {
		this.debitCards = debitCards;
	}

}
