package com.centime.service3.serviceimpl;

import com.centime.service3.dto.Customer;
import com.centime.service3.service.Service3Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Service3ServiceImpl implements Service3Service {

    @Override
    public String getValues(Customer customer) {
    log.info("Resquested Json :{}",customer.toString());
        return customer.getName()+" "+customer.getSurname();

    }
}
