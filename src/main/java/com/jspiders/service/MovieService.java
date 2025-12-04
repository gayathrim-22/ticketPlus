package com.jspiders.service;

import com.jspiders.dto.MovieDto;
import com.jspiders.entity.MovieEntity;

import java.util.List;

public interface MovieService {
    void addMovie(MovieDto movieDto);
    MovieEntity getMovie(Long movieId);
    List <MovieEntity> getAllMovies();
}
