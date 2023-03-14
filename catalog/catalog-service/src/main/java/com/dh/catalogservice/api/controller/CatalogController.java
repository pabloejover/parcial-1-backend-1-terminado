package com.dh.catalogservice.api.controller;

import com.dh.catalogservice.api.client.IMovieServiceClient;
import com.dh.catalogservice.api.service.CatalogService;
import com.dh.catalogservice.domain.model.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/catalog")
public class CatalogController {

    private final IMovieServiceClient iMovieServiceClient;

    @GetMapping("/{catalog}")
    ResponseEntity<List<Movie>> getCatalog(@PathVariable String catalog) {
        return iMovieServiceClient.getMoviesByGenre(catalog);
    }




}
