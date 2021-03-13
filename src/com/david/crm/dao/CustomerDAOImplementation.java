package com.david.crm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.david.crm.entity.Customer;

@Repository
public class CustomerDAOImplementation implements CustomerDAO {

	// need to inject the hibernate session factory

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query
		Query<Customer> newQuery = currentSession.createQuery("from Customer", Customer.class);

		// execute query and get result list of customers
		List<Customer> customers = newQuery.getResultList();

		// return the results
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {

		// get current hibernate session

		Session currentSession = sessionFactory.getCurrentSession();

		// save the customer

		currentSession.save(theCustomer);

	}

}
