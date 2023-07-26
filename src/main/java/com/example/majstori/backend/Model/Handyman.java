package com.example.majstori.backend.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "Handyman")
@Data
public class Handyman {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long handyman_id;

    @Column(nullable = false)
    private String full_name;

    @Column(nullable = false)
    private String email;

    @Column
    private String phone_number;

    @Column
    private String bio;

    @Column
    private String profile_picture_url;

    @Column
    private String facebook_link;

    @Column
    private String youtube_link;

    @Column
    private String website_link;

    // Other relevant fields and relationships

    // Getters and setters (omitted for brevity)

    @ManyToMany
    @JoinTable(name = "Handyman_Category",
            joinColumns = @JoinColumn(name = "handyman_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories;

    @OneToMany(mappedBy = "handyman")
    private List<Review> reviews;
}

