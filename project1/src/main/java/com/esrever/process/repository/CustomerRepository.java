package com.esrever.process.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esrever.process.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
