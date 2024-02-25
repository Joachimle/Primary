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
        String s = "";
        // s +=
        for (Movie sm : movieArrayList){
            if (sm.getTitle().toLowerCase().contains(searchMovieInput.toLowerCase())){
                //return sm.toString();
                //Ved at fjerne vores return, kan vi ændre koden til at returnere en String med samtlige matches
            }
        }
        return "fejl";
    }
}

