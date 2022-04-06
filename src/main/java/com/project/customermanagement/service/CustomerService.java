package com.project.customermanagement.service;

import org.springframework.http.ResponseEntity;

import com.project.customermanagement.model.Customer;

public interface CustomerService {

	ResponseEntity<Customer> findByEmail(String email);

	ResponseEntity<Customer> findByMobile(int mobile);
}
