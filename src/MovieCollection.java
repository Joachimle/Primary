import java.util.ArrayList;

public class MovieCollection {
    ArrayList<Movie> movieArrayList = new ArrayList<>();

    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, String genre){
        Movie movie1 = new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
        movieArrayList.add(movie1);
    }
    public String toString() {
        String result = "";
        for (Movie m : movieArrayList){
            result += m.toString() + "\n";
            //System.out.println();
        }

        return result;
    }

    public String searchMovie(String searchMovieInput){
        String searchMovieStr = "";

        for (Movie movieSearch : movieArrayList){
            if (movieSearch.getTitle().toLowerCase().contains(searchMovieInput.toLowerCase())){
                searchMovieStr += movieSearch.toString();
           // } else {
             //   return "Ingen film matcher denne søgning, prøv igen\n";
            }
            if (!(searchMovieStr.length() > 0)){
                return "\nIngen film matcher denne søgning, prøv igen";
            }
        }
        return searchMovieStr;
    }
}

