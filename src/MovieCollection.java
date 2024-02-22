import java.util.ArrayList;

public class MovieCollection {
    ArrayList<Movie> movieArrayList = new ArrayList<>();

    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, String genre){
        Movie movie1 = new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
        movieArrayList.add(movie1);
    }
    @java.lang.Override
    public String toString() {
        String result = "";
        for (Movie m : movieArrayList){
            result += m.toString();
            //System.out.println();
        }

        return result;
    }
}
//toString method
