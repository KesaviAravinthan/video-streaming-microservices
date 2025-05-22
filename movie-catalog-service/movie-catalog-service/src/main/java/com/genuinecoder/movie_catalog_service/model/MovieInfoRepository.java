package com.genuinecoder.moviecatalogservice.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieInfoRepository extends JpaRepository<MovieInfo, Long> {
    // This interface will automatically provide CRUD operations for MovieInfo entity
    // No need to implement any methods, Spring Data JPA will handle it

    
} 
