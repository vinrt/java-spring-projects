package com.example.demo.services;

import com.example.demo.domain.Customer;

import java.util.List;

/**
 * Created by vinayraghavtiwari on 23/10/18.
 */
public interface CustomerService {

    Customer findCustomerById(Long Id);

    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);
}
