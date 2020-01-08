package com.mindtree.bankmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.bankmanagement.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	Customer findBycustomerName(String customerName);

}
