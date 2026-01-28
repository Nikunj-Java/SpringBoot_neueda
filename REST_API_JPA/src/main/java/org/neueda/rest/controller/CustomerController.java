package org.neueda.rest.controller;

import org.neueda.rest.entity.Customer;
import org.neueda.rest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping("/")
    public Customer save(@RequestBody Customer customer) {
        return service.save(customer);
    }
    @GetMapping("/")
    public List<Customer> getAllCustomers(){
        return  service.getAllCustomers();
    }
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Integer id){
        return  service.getCustomerById(id);
    }
    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable Integer id){
        service.deleteCustomer(id);
        return "Customer deleted Successfully";
    }
    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Integer id, @RequestBody Customer customer){
        customer.setId(id);
        return  service.save(customer);
    }

}
