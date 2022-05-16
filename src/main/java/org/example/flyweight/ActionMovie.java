package org.example.flyweight;

import java.util.Date;

/**
 * The context class
 */
public class ActionMovie implements Movie {

    // The mutable, extrinsic state of a Movie object
    private final String name;
    private final Date releaseDate;

    // The immutable, instrinsic state of a Movie object (genre and rating)
    // E.g. All "Action" movies have the same rating of "PG13")
    // E.g. All "Romance" movies have the same rating of "R21")
    private final MovieType movieType;

    public ActionMovie(String name, Date releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.movieType = new MovieType("Action", "PG13");
    }

    public String describe() {
        return name + releaseDate + movieType.toString() + ")";
    }

    public MovieType getType() {
        return movieType;
    }
}