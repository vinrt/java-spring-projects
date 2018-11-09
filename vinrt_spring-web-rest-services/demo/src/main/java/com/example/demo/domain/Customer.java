package com.example.demo.domain;

import lombok.Data;
import lombok.Generated;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by vinayraghavtiwari on 23/10/18.
 */
@Data // lombok produce getter and setter along with many configurations
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;

}
