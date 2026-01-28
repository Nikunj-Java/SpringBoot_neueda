package org.neueda.rest.service;

import org.neueda.rest.entity.Customer;
import org.neueda.rest.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private final CustomerRepo repo=null;

    //constructor DI
//    public CustomerService(CustomerRepo repo){
//        this.repo=repo;
//    }

    //call save method
    public  void addCustomer(Customer c){
        repo.addCustomer(c);
    }

    //call getAllCustomers method
    public List<Customer> getAllCustomers(){
        return  repo.getAllCustomers();
    }
    //call getCustomerById method
    public Customer getCustomerById(int id){
        return repo.getCustomerById(id);
    }
    //delete
    public void deleteCustomer(int id){
        repo.deleteCustomer(id);
    }
    //update
    public void updateCustomer(Customer customer){
        repo.updateCustomer(customer);
    }
}
