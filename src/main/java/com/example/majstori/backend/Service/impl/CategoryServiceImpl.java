package com.example.majstori.backend.Service.impl;

import com.example.majstori.backend.Model.Category;
import com.example.majstori.backend.Repository.CategoryRepository;
import com.example.majstori.backend.Service.CategoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> save(String category_name, String picture_url) {
        if (category_name == null || category_name.isEmpty() || picture_url == null || picture_url.isEmpty()) {
            throw new RuntimeException(); // TODO make exception
        }
        return Optional.of(categoryRepository.save(new Category(category_name, picture_url)));
    }

    @Override
    @Transactional
    public Optional<Category> update(Long id, String category_name, String picture_url) {
        if (category_name == null || category_name.isEmpty() || picture_url == null || picture_url.isEmpty()) {
            throw new RuntimeException(); // TODO make exception
        }
        Category category = categoryRepository.findById(id).orElseThrow(); //TODO make exception
        category.setCategory_name(category_name);
        category.setPicture_url(picture_url);
        return Optional.of(categoryRepository.save(category));
    }

    @Override
    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }
}
