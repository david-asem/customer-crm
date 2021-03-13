package com.david.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.david.crm.dao.CustomerDAO;
import com.david.crm.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// inject customer Dao into customer controller using spring DI
	@Autowired
	private CustomerDAO customerDAO;

	@RequestMapping("/list")
	public String listCustomer(Model theModel) {

		// get customers from dao
		List<Customer> theCustomers = customerDAO.getCustomers();

		
		// add the customers to the models
		theModel.addAttribute("customers", theCustomers);

		return "list-customers";

	}
}
