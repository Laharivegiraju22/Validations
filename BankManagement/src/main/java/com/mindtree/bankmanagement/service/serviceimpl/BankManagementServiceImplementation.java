package com.mindtree.bankmanagement.service.serviceimpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bankmanagement.dto.CustomerDto;
import com.mindtree.bankmanagement.dto.DebitCardDto;
import com.mindtree.bankmanagement.entity.Customer;
import com.mindtree.bankmanagement.entity.DebitCard;
import com.mindtree.bankmanagement.exceptions.serviceexception.BankManagementServiceException;
import com.mindtree.bankmanagement.exceptions.serviceexception.NoDetailsFoundException;
import com.mindtree.bankmanagement.repository.CustomerRepository;
import com.mindtree.bankmanagement.repository.DebitCardRepository;
import com.mindtree.bankmanagement.service.BankManagementService;

@Service
public class BankManagementServiceImplementation implements BankManagementService {
	@Autowired
	CustomerRepository customerRepo;

	@Autowired
	DebitCardRepository debitCardRepo;

	ModelMapper modelMapper = new ModelMapper();

	public CustomerDto addCustomerToDb(Customer customer) {
		customerRepo.save(customer);
		return modelMapper.map(customer, CustomerDto.class);
	}

	public List<CustomerDto> getCustomerNames() {
		List<Customer> customers = customerRepo.findAll();
		List<CustomerDto> customerDtos = customers.stream().map(c -> modelMapper.map(c, CustomerDto.class))
				.collect(Collectors.toList());

		return customerDtos;
	}

	@Override
	public DebitCardDto addDebitCardDetailsToDb(String customerName, DebitCard debitCard) {
		Customer customer = customerRepo.findBycustomerName(customerName);
		Set<DebitCard> debitCards = new HashSet<DebitCard>();
		debitCards.add(debitCard);
		customer.getDebitCards().add(debitCard);
		Set<DebitCardDto> debitCardDto = debitCards.stream().map(d -> modelMapper.map(d, DebitCardDto.class))
				.collect(Collectors.toSet());
		debitCardRepo.save(debitCard);
		// customerRepo.save(customer);
		return modelMapper.map(debitCard, DebitCardDto.class);
	}

	@Override
	public List<Customer> getAllCustomers() throws BankManagementServiceException {
		List<Customer> customers = customerRepo.findAll();
		if (customers.isEmpty()) {
			throw new NoDetailsFoundException("there are no details");
		}

		return customers;
	}

}
