package com.example.screenmach.domain;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Episode(@JsonAlias("Title") String title,
                      @JsonAlias("Year") Integer year,
                      @JsonAlias("Season") Integer season,
                      @JsonAlias("Episode") Integer episode,
                      @JsonAlias("imdbRating")Double imdbRating) {
}
