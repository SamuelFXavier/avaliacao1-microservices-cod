package com.dh.catalogservice.service.impl;

import com.dh.catalogservice.dto.CatalogDTO;
import com.dh.catalogservice.dto.MovieDTO;
import com.dh.catalogservice.repository.MovieFeign;
import com.dh.catalogservice.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements CatalogService {

    @Autowired
    private MovieFeign movieFeign;

    @Override
    public CatalogDTO findMoviesByGenre(String genre) {
        List<MovieDTO> movies = movieFeign.findMoviesByGenre(genre);
        return new CatalogDTO(genre.toUpperCase(), movies);
    }
}