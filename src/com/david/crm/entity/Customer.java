package com.david.crm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {

	// map the fields to match database columns
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "email")
	private String email;
	
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "branch")
	private String branch;

	
	
	//default constructor
	public Customer() {

	}

	//getters and setters using fields
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	
	//helps in loggin
	@Override
	public String toString() {
		return "Customer [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", address=" + address + ", branch=" + branch + "]";
	}


}
