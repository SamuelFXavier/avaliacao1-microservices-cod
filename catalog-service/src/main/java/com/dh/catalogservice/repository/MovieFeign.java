package com.dh.catalogservice.repository;

import com.dh.catalogservice.dto.MovieDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("movie-service")
public interface MovieFeign {

    @GetMapping("/movies/{genre}")
    List<MovieDTO> findMoviesByGenre(@PathVariable String genre);
}