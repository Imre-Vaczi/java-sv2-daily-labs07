package day02.day02;

import day02.Movie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MovieService {

    private List<Movie> listOfMovies = new ArrayList<>();

    public List<Movie> getListOfMovies() {
        return listOfMovies;
    }

    public MovieService(Path path) {
        for (String movie : readFile(path)) {
            listOfMovies.add(new Movie(
                    cutIntoSections(movie)[0],
                    Integer.parseInt(cutIntoSections(movie)[1]),
                    cutIntoSections(movie)[2]
            ));
        }
    }

    private List<String> readFile(Path path) {
        List<String> result = new ArrayList<>();
        try {
            result = Files.readAllLines(path);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return result;
    }

    private String[] cutIntoSections(String movieText) {
        return movieText.split(";");
    }
}
