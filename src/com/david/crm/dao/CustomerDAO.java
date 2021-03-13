package com.david.crm.dao;

import java.util.List;

import com.david.crm.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

}
