package com.infy.SpringDataRESTdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.SpringDataRESTdemo.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
