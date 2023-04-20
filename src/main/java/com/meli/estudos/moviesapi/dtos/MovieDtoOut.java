package com.meli.estudos.moviesapi.dtos;

import java.time.LocalDate;

public record MovieDtoOut(Long id, String name, LocalDate date, String genre) {
}
