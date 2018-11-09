package com.example.demo.repositories;
import com.example.demo.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vinayraghavtiwari on 23/10/18.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long >{
}
