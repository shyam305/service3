package com.centime.service3.controller;


import com.centime.service3.dto.Customer;
import com.centime.service3.service.Service3Service;
import com.centime.service3.serviceimpl.Service3ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/service-three")
public class Service3Controller {
    @Autowired
    private Service3Service service3Service;

    @GetMapping("/health")
    public String getHealth() {
        return "Up";
    }

    @PostMapping("/concatenated-string")
    private String getValues(@RequestBody @Valid Customer customer) {

        return service3Service.getValues(customer);
    }
}
