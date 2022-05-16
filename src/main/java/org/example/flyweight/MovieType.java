package org.example.flyweight;

/**
 * The flyweight class
 */
public class MovieType {
    private final String genre;
    private final String rating;

    public MovieType(String genre, String rating) {
        this.genre = genre;
        this.rating = rating;
    }

    public String toString() {
        return "MovieType [genre=" + genre + ", rating=" + rating + "]";
    }
}
