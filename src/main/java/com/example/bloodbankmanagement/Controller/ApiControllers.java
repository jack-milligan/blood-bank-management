package com.example.bloodbankmanagement.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiControllers {

    @GetMapping(value = "/")
    public String getPage(){
        return "Web Page";
    }

//    @Autowired
//    private CustomerRepo customerRepo;
//
//    @GetMapping(value = "/customers")
//    public List<Customer> getCustomers(){
//        return customerRepo.findAll();
//    }
}

