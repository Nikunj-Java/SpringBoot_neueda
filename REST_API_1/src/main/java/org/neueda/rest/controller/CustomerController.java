package org.neueda.rest.controller;

import org.neueda.rest.entity.Customer;
import org.neueda.rest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer") //localhost:8080/customer
public class CustomerController {
    @Autowired
    private final CustomerService service=null;

//    //DI
//    public CustomerController(CustomerService service){
//        this.service=service;
//    }

    //INSERT RECORD (CREATE)
    @PostMapping("/") //localhost:8080/customer/
    public String addCustomer(@RequestBody Customer customer){
        service.addCustomer(customer);
        return "Customer Added Successfully!";

    }
    //READ-ALL (RETRIVE RECORD)
    @GetMapping("/")
    public List<Customer> getAllCustomers(){
        return  service.getAllCustomers();
    }

    //GET BY ID
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id){
        return service.getCustomerById(id);
    }
    //delete by id
    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable int id){
        service.deleteCustomer(id);
        return "Customer Deleted Successfully!";
    }
    //update by id --> (PUT | PATCH)
    @PutMapping("/{id}")
    public String updateCustomer(@PathVariable int id, @RequestBody Customer customer){
        customer.setId(id);
        service.updateCustomer(customer);
        return "Customer Updated Successfuly";
    }


}
