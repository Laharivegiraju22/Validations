package com.mindtree.bankmanagement.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.bankmanagement.exceptions.serviceexception.NoDetailsFoundException;

@ControllerAdvice
public class BankManagementRestControllerAdvice {

	@ExceptionHandler(NoDetailsFoundException.class)
	public ModelAndView noDetails(Exception e, Throwable t, Model model) {
		model.addAttribute("errormessage", e.getLocalizedMessage());
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("noDetailsError");
		return modelAndView;
	}
}
