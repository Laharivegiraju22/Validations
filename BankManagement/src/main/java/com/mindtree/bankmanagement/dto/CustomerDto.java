package com.mindtree.bankmanagement.dto;

import java.util.Set;

public class CustomerDto {
	private int customerId;
	private String customerName;
	private int age;
	private Set<DebitCardDto> debitCardDtos;

	public CustomerDto() {
		super();
	}

	public CustomerDto(int customerId, String customerName, int age, Set<DebitCardDto> debitCardDtos) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.age = age;
		this.debitCardDtos = debitCardDtos;
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

	public Set<DebitCardDto> getDebitCardDtos() {
		return debitCardDtos;
	}

	public void setDebitCardDtos(Set<DebitCardDto> debitCardDtos) {
		this.debitCardDtos = debitCardDtos;
	}
}
