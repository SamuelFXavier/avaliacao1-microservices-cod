package com.dh.movieservice.controller;

import com.dh.movieservice.dto.MovieDTO;
import com.dh.movieservice.model.Movie;
import com.dh.movieservice.service.impl.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieServiceImpl movieService;

    @PostMapping
    public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie){
        return ResponseEntity.status(HttpStatus.CREATED).body(movieService.saveMovie(movie));
    }

    @GetMapping("/{genre}")
    public ResponseEntity<List<MovieDTO>> findMoviesByGenre(@PathVariable String genre){
        return ResponseEntity.ok(movieService.findMoviesByGenre(genre));
    }
}