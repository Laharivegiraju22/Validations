package com.mindtree.bankmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.bankmanagement.dto.CustomerDto;
import com.mindtree.bankmanagement.dto.DebitCardDto;
import com.mindtree.bankmanagement.entity.Customer;
import com.mindtree.bankmanagement.entity.DebitCard;
import com.mindtree.bankmanagement.exceptions.serviceexception.BankManagementServiceException;

@Service
public interface BankManagementService {

	CustomerDto addCustomerToDb(Customer customer);

	List<CustomerDto> getCustomerNames();

	DebitCardDto addDebitCardDetailsToDb(String customerName, DebitCard debitCard);

	List<Customer> getAllCustomers() throws BankManagementServiceException;

}
