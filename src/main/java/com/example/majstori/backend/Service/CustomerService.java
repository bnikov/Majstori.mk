package com.example.majstori.backend.Service;

import com.example.majstori.backend.Model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CustomerService {

    Optional<Customer> findById(Long id);

    List<Customer> findAll();
}
