import java.util.ArrayList;

public class MovieCollection {
    ArrayList<Movie> movieArrayList = new ArrayList<>();

    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, String genre){
        Movie movie1 = new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
        movieArrayList.add(movie1);
    }
}
