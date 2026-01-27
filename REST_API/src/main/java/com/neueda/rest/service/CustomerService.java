package com.neueda.rest.service;

import com.neueda.rest.entity.Customer;
import com.neueda.rest.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository repository;

    //constructor injection (DI)
    public CustomerService(CustomerRepository repo){
        this.repository=repo;
    }

    //connect with repo for CRUD Operation
    public void addCustomer(Customer c){
        repository.addCustomer(c);
    }
}
