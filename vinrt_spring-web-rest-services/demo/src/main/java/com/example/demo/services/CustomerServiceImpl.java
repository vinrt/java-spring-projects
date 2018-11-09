package com.example.demo.services;

import com.example.demo.repositories.CustomerRepository;
import com.example.demo.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by vinayraghavtiwari on 24/10/18.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
