package org.neueda.rest.service;

import org.neueda.rest.entity.Customer;
import org.neueda.rest.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo repo;

    public Customer save(Customer customer) {
        return repo.save(customer);
    }
}
