package com.ranko.rent_a_car.repository;

import com.ranko.rent_a_car.model.Customer;
import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName) throws DataAccessException;

	Customer findById(Long id) throws DataAccessException;

}