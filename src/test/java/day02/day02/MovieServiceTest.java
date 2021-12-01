package day02.day02;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    @Test
    void testGenerating() {
        MovieService movieService = new MovieService(Paths.get("src/main/resources/movies.csv"));
        assertEquals(5, movieService.getListOfMovies().size());
        assertEquals("Jaws", movieService.getListOfMovies().get(4).getTitle());
    }

}