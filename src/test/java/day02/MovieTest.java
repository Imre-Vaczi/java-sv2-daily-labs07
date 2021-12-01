package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    @Test
    void testGenerating() {
        Movie movie = new Movie("Pi", 1998, "Darren Aronofsky");
        assertEquals("Pi", movie.getTitle());
        assertEquals(1998, movie.getRelease());
        assertEquals("Darren Aronofsky", movie.getDirector());
    }
}