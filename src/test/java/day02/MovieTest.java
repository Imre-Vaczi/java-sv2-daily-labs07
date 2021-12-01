package day02;

import day02.MovieService;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Paths;

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