package com.project.customermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.customermanagement.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
//	@Modifying
//	@Transactional
//	@Query("delete from customer")
//	void truncate();
}
