import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        MovieCollection movieCollection = new MovieCollection();


        System.out.println("For at tilføje en film, indtast venligst følgende: ");
        System.out.println("Titel: ");
        String userTitle = input.nextLine();
        System.out.println("Instruktør: ");
        String userDirector = input.nextLine();
        System.out.println("Udgivelsesår: ");
        int userYearCreated = input.nextInt();
        System.out.println("Er filmen i farve? (true/false): ");
        boolean userIsInColor = input.nextBoolean();
        System.out.println("Filmens længde i minutter: ");
        int userLengthInMinutes = input.nextInt();
        System.out.println("Genre: ");
        String userGenre = input.next();

        //Movie movieDemo = new Movie(userTitle, userDirector, userYearCreated, userIsInColor, userLengthInMinutes, userGenre);
        //System.out.println("Du har tilføjet følgende film: " + movieDemo.getTitle() + movieDemo.getDirector() + movieDemo.getYearCreated() + movieDemo.getIsInColor() + movieDemo.getLengthInMinutes() + movieDemo.getGenre());

    }
}
