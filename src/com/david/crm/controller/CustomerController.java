package com.david.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.david.crm.entity.Customer;
import com.david.crm.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// inject customer service into customer controller using spring DI

	@Autowired
	private CustomerService customerService;

	@GetMapping("/list")
	public String listCustomer(Model theModel) {

		// get customers from the service layer
		List<Customer> theCustomers = customerService.getCustomers();

		// add the customers to the models
		theModel.addAttribute("customers", theCustomers);

		return "list-customers";

	}
}
