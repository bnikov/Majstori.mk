package com.example.majstori.backend.Repository;

import com.example.majstori.backend.Model.Handyman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HandymanRepository extends JpaRepository<Handyman, Long> {
}
