package com.meli.estudos.moviesapi.service;


import com.meli.estudos.moviesapi.dtos.MovieDtoIn;
import com.meli.estudos.moviesapi.dtos.MovieDtoOut;

public interface MovieService {

    MovieDtoOut create(MovieDtoIn movieDtoIn);



}
