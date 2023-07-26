package com.example.majstori.backend.Service;

import com.example.majstori.backend.Model.Handyman;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface HandymanService {

    Optional<Handyman> findById(Long id);

    List<Handyman> findAll();

}
