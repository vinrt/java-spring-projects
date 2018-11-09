package com.example.demo.bootstrap;

import com.example.demo.domain.Customer;
import com.example.demo.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


/**
 * Created by vinayraghavtiwari on 24/10/18.
 */
@Component
public class BootStrapData implements CommandLineRunner{

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    private final CustomerRepository customerRepository;


    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading Customer Data..");

        Customer c1 = new Customer();
        c1.setFirstname("Sofia");
        c1.setLastname("Eriksson");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstname("Vinay");
        c2.setLastname("Raghav");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstname("Bjorn");
        c3.setLastname("Eriksson");
        customerRepository.save(c3);


        System.out.println("Customer Saved :" + customerRepository.count());
    }
}
