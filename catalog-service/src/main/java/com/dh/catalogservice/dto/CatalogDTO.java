package com.dh.catalogservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CatalogDTO {

    private String genre;
    private List<MovieDTO> movies;
}