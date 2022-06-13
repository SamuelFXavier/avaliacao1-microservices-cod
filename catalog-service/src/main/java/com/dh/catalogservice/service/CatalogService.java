package com.dh.catalogservice.service;

import com.dh.catalogservice.dto.CatalogDTO;
import org.springframework.stereotype.Service;

@Service
public interface CatalogService {

    CatalogDTO findMoviesByGenre(String genre);
}