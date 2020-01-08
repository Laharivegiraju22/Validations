package com.mindtree.bankmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.bankmanagement.entity.Customer;
import com.mindtree.bankmanagement.entity.DebitCard;
import com.mindtree.bankmanagement.exceptions.serviceexception.BankManagementServiceException;
import com.mindtree.bankmanagement.service.BankManagementService;

@Controller
public class BankManagementController {

	@Autowired
	BankManagementService bankService;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/addCustomer")
	public String add() {
		return "addCustomer";
	}

	@RequestMapping("/addCustomerToDb")
	public String addCustomerToDb(Customer customer) {
		bankService.addCustomerToDb(customer);
		return "addCustomer";
	}

	@RequestMapping("/addDebitCard")
	public String addDebitCard(Model model) {
		model.addAttribute("customers", bankService.getCustomerNames());
		return "addDebitCard";
	}

	@RequestMapping("/addDebitCardDetailsToDb")
	public String addDebitCardDetailsToDb(@RequestParam String customerName, DebitCard debitCard) {
		bankService.addDebitCardDetailsToDb(customerName, debitCard);
		return "index";
	}

	@RequestMapping("/viewAll")
	public ModelAndView viewAll(Model model) throws BankManagementServiceException {
		model.addAttribute("customers", bankService.getAllCustomers());
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("viewAllDetails");
		return modelAndView;

	}
}
