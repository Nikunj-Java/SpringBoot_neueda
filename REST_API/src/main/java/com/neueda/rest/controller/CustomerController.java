package com.neueda.rest.controller;

import com.neueda.rest.entity.Customer;
import com.neueda.rest.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer") //localhost:8080/customer
public class CustomerController {
    private final CustomerService service;

    //DI
    public CustomerController(CustomerService service){
        this.service= service;
    }

    //CREATE-POST Mapping- you have to choose POST Method
    @PostMapping("/")
    public String addCustomer(@RequestBody Customer c){

        service.addCustomer(c);
        return "Customer Added Successfully!";
    }
}
