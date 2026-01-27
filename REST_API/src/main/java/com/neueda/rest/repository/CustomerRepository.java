package com.neueda.rest.repository;

import com.neueda.rest.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CustomerRepository {
    private List<Customer> customers= new ArrayList<>();

    //CREATE
    public void addCustomer(Customer c){
        customers.add(c);
    }

}
