package com.example.majstori.backend.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "Category")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long category_id;

    @Column(nullable = false)
    private String category_name;

    @Column
    private String picture_url;

    @ManyToMany(mappedBy = "categories")
    private List<Handyman> handymen;

    public Category() {
    }

    public Category(String category_name, String picture_url) {
        this.category_name = category_name;
        this.picture_url = picture_url;
    }
}
