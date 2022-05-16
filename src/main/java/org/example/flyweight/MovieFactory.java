package org.example.flyweight;

import java.util.Date;
import java.util.Map;

public class MovieFactory {
    private final Map<String, Movie> movieTypes = new java.util.HashMap<>();

    public Movie createMovie(String type) {
        Movie movie = movieTypes.get(type);

        if (movie == null) {
            if (type.equals("action")) {
                movie = new ActionMovie("action", new Date());
            } else if (type.equals("romance")) {
                movie = new RomanceMovie("romance", new Date());
            }
            movieTypes.put(type, movie);
        }
        return movie;
    }
}