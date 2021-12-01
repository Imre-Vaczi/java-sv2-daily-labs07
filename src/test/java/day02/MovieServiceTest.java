package day02;

import day02.MovieService;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    @Test
    void testGenerating() {
        MovieService movieService = new MovieService(Paths.get("src/main/resources/movies.csv"));
        assertEquals(5, movieService.getListOfMovies().size());
        assertEquals("Jaws", movieService.getListOfMovies().get(4).getTitle());
    }

    @Test
    void testGeneratingInvalidPath() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> new MovieService(Paths.get("src/main/resources/movies.txt")));
        assertEquals("File can not be read.", exception.getMessage());
    }

}