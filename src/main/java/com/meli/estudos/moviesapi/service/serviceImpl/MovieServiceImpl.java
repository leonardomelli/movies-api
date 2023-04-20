package com.meli.estudos.moviesapi.service.serviceImpl;

import com.meli.estudos.moviesapi.dtos.MovieDtoIn;
import com.meli.estudos.moviesapi.dtos.MovieDtoOut;
import com.meli.estudos.moviesapi.entities.Movie;
import com.meli.estudos.moviesapi.repository.MovieRepository;
import com.meli.estudos.moviesapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository repository;

    @Override
    public MovieDtoOut create(MovieDtoIn movieDtoIn) {
        //validar nome do movie, criar uma nova instancia de movie, salva no bonco,criar movieDtoOut, retornar.
        Movie entity = new Movie();

        entity.setName(movieDtoIn.name());
        entity.setDate(movieDtoIn.date());
        entity.setGenre(movieDtoIn.genre());

        entity = repository.save(entity);

        return new MovieDtoOut(entity.getId(), entity.getName(), entity.getDate(), entity.getGenre());
    }
}
