package com.meli.estudos.moviesapi.dtos;

import java.time.LocalDate;

public record MovieDtoIn(String name, LocalDate date, String genre) {

}
