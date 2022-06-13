package com.dh.movieservice.service;

import com.dh.movieservice.dto.MovieDTO;
import com.dh.movieservice.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MovieService {

    Movie saveMovie(Movie movie);

    List<MovieDTO> findMoviesByGenre(String genre);
}