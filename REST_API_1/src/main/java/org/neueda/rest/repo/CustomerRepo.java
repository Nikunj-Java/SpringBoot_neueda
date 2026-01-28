package org.neueda.rest.repo;

import org.neueda.rest.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CustomerRepo {

    private List<Customer> customers= new ArrayList<>();

    //CREATE RECORD
    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    //READ (GETALL)
    public List<Customer> getAllCustomers(){
        return customers;
    }
    //GET BY ID
    public Customer getCustomerById(int id){
        return customers.stream()
                .filter((c->c.getId() == id))
                .findFirst().orElse(null);
    }

    //DELETE BY ID
    public void deleteCustomer(int id){
        customers.removeIf(c->c.getId() == id);
    }
    //update by (body)
    public void updateCustomer(Customer customer){
        for(int i=0; i<customers.size(); i++){
            if(customers.get(i).getId() == customer.getId()){
                customers.set(i,customer);
                return;
            }
        }
    }
}
