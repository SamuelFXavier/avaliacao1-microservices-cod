package com.dh.catalogservice.dto;

import lombok.Data;

@Data
public class MovieDTO {

    private Integer id;
    private String name;
    private String genre;
    private String urlStream;
}