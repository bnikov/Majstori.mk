package com.example.majstori.backend.Service;

import com.example.majstori.backend.Model.Review;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ReviewService {

    Optional<Review> findById(Long id);

    List<Review> findAll();
}
