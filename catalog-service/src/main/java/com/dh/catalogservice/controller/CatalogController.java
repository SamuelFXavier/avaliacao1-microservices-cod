package com.dh.catalogservice.controller;

import com.dh.catalogservice.dto.CatalogDTO;
import com.dh.catalogservice.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping("/movie/{genre}")
    public ResponseEntity<CatalogDTO> findMoviesByGenre(@PathVariable String genre){
        return ResponseEntity.ok(catalogService.findMoviesByGenre(genre));
    }
}