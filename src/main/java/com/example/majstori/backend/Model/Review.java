package com.example.majstori.backend.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "Review")
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comment_id;

    @ManyToOne
    @JoinColumn(name = "handyman_id")
    private Handyman handyman;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "stars")
    private Integer stars;

    @Column(name = "comment_content")
    private String comment_content;

    @Column(nullable = false)
    private Timestamp timestamp;

}


