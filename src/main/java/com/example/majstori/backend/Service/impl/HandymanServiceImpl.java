package com.example.majstori.backend.Service.impl;

import com.example.majstori.backend.Model.Handyman;
import com.example.majstori.backend.Repository.HandymanRepository;
import com.example.majstori.backend.Service.HandymanService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HandymanServiceImpl implements HandymanService {

    private final HandymanRepository handymanRepository;

    public HandymanServiceImpl(HandymanRepository handymanRepository) {
        this.handymanRepository = handymanRepository;
    }

    @Override
    public Optional<Handyman> findById(Long id) {
        return handymanRepository.findById(id);
    }

    @Override
    public List<Handyman> findAll() {
        return handymanRepository.findAll();
    }
}
