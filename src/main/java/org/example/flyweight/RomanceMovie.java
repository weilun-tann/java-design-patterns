package org.example.flyweight;

import java.util.Date;

/**
 * The context class
 */
public class RomanceMovie implements Movie {

    // The mutable, extrinsic state of a Movie object
    private final String name;
    private final Date releaseDate;

    // The immutable, intrinsic state of a Movie object (genre and rating)
    // E.g. All "Action" movies have the same rating of "PG13")
    // E.g. All "Romance" movies have the same rating of "R21")
    private final MovieType movieType;

    public RomanceMovie(String name, Date releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.movieType = new MovieType("Romance", "R21");
    }

    public String describe() {
        return name + " " + releaseDate + " " + movieType;
    }

    public MovieType getType() {
        return movieType;
    }
}