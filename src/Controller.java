public class Controller {
    MovieCollection movieCollection;

    public Controller() {
        movieCollection = new MovieCollection();
    }

    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, String genre) {
        movieCollection.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
    }

    //Returnerer hele filmsamlingen som String
    public String showMovieCollection(){
        return movieCollection.toString();
    }

    public String showSearchMovie(String searchWord){
        return movieCollection.searchMovie(searchWord);
    }
}