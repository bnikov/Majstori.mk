package com.example.majstori.backend.Service.impl;

import com.example.majstori.backend.Model.Review;
import com.example.majstori.backend.Repository.ReviewRepository;
import com.example.majstori.backend.Service.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository commentRepository;

    public ReviewServiceImpl(ReviewRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public Optional<Review> findById(Long id) {
        return commentRepository.findById(id);
    }

    @Override
    public List<Review> findAll() {
        return commentRepository.findAll();
    }
}
