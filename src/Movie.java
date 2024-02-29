public class Movie {
    //Attributes
    private String title;
    private String director;
    private int yearCreated;
    private boolean isInColor;
    private int lengthInMinutes;
    private String genre;

    //Constructor
    public Movie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, String genre){
        this.title = title;
        this.director = director;
        this.yearCreated = yearCreated;
        this.isInColor = isInColor;
        this.lengthInMinutes = lengthInMinutes;
        this.genre = genre;
    }
    //Getter methods
    public String getTitle(){
        return title;
    }
    public String getDirector(){
        return director;
    }
    public int getYearCreated(){
        return yearCreated;
    }
    public boolean getIsInColor(){
        return isInColor;
    }
    public int getLengthInMinutes(){
        return lengthInMinutes;
    }
    public String getGenre(){
        return genre;
    }

    public String setTitle(int index, String newTitle){
        this.title = newTitle;
        return title;
    }
    public String setDirector(int index, String newDirector){
        this.director = newDirector;
        return director;
    }
    public int setYearCreated(int index, int newYearCreated){
        this.yearCreated = newYearCreated;
        return yearCreated;
    }

    @java.lang.Override
    public String toString(){
        String result = "";
        result += "Filmtitel: " + title + ", Instruktør: " + director + ", Udgivelsesår: " + yearCreated + ", Farvefilm: ";

        if (isInColor){
            result += "Ja ";
        } else{
            result += "Nej ";
        }

        result += ", Længde i minutter: " + lengthInMinutes + ", Genre: " + genre + "\n";
        return result;
    }

}
