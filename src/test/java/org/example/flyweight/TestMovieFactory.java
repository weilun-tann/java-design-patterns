package org.example.flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class TestMovieFactory {
    @Test
    void shouldReturnIdenticalMovieTypes() {
        MovieFactory factory = new MovieFactory();
        Movie movie1 = factory.createMovie("action");
        Movie movie2 = factory.createMovie("action");
        assertEquals(movie1, movie2);

        Movie movie3 = factory.createMovie("romance");
        Movie movie4 = factory.createMovie("romance");
        assertEquals(movie3, movie4);
    }

    @Test
    void shouldReturnDifferentMovieTypes() {
        MovieFactory factory = new MovieFactory();
        Movie movie1 = factory.createMovie("action");
        Movie movie2 = factory.createMovie("romance");
        assertNotEquals(movie1, movie2);
    }
}
