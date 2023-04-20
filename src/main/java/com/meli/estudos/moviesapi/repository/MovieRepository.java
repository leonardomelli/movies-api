package com.meli.estudos.moviesapi.repository;

import com.meli.estudos.moviesapi.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository< Movie, Long> {
}
