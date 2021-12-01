package day02;

public class Movie {
    private String title;
    private int release;
    private String director;

    public Movie(String title, int release, String director) {
        this.title = title;
        this.release = release;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public int getRelease() {
        return release;
    }

    public String getDirector() {
        return director;
    }
}
