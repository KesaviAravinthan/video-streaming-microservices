package com.genuinecoder.moviecatalogservice.controller;

import com.genuinecoder.moviecatalogservice.model.MovieInfo;
import com.genuinecoder.moviecatalogservice.model.MovieInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieInfoController {
    @Autowired
    // This will be automatically injected by Spring
    // because we have annotated MovieInfoRepository with @Repository
    private MovieInfoRepository repository;

    @PostMapping("/movie-info/save")
    public List<MovieInfo> saveAll(@RequestBody List<MovieInfo> movieInfoList) {
        // This will save all the movie info objects in the database
        return repository.saveAll(movieInfoList);
    }

    @GetMapping("/movie-info/list")
    public List<MovieInfo> getAll() {
        // This will return all the movie info objects from the database
        return repository.findAll();
    }
}
