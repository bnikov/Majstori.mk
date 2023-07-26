package com.example.majstori.backend.Service;

import com.example.majstori.backend.Model.Category;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CategoryService {

    Optional<Category> findById(Long id);

    List<Category> findAll();

    Optional<Category> save(String category_name, String picture_url);

    Optional<Category> update(Long id, String category_name, String picture_url);

    void deleteById(Long id);
}
