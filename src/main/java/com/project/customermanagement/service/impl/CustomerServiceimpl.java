package com.project.customermanagement.service.impl;

import org.springframework.http.ResponseEntity;

import com.project.customermanagement.model.Customer;
import com.project.customermanagement.service.CustomerService;

public class CustomerServiceimpl implements CustomerService {

	@Override
	public ResponseEntity<Customer> findByEmail(String email) {

		return null;
	}

	@Override
	public ResponseEntity<Customer> findByMobile(int mobile) {

		return null;
	}

}
