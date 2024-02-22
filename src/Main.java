import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //MMovieCollection movieCollection = new MovieCollection();
        Controller controller = new Controller();

        System.out.println("Velkommen til din filmsamling");
        System.out.println("Tast 1; For at oprette en film");
        System.out.println("Tast 2; For at afslutte");
        System.out.println("Tast 3; For at se en liste over dine film");

        int sentinel = 2;
        int choice = input.nextInt();

        while (choice != sentinel) {
            if (choice == 1) {
                input.nextLine();
                System.out.println("For at tilføje en film, indtast venligst følgende: ");
                System.out.println("Titel: ");
                String userTitle = input.nextLine();
                System.out.println("Instruktør: ");
                String userDirector = input.nextLine();
                System.out.println("Udgivelsesår: ");
                int userYearCreated = input.nextInt();

                System.out.println("Er filmen i farve, skriv ja, ellers, skriv nej ");
                boolean userIsInColor = false;
                String farve = input.next();
                farve = farve.toLowerCase();
                if (farve.equals("ja")){
                    userIsInColor = true;
                }

                System.out.println("Filmens længde i minutter: ");
                int userLengthInMinutes = input.nextInt();
                System.out.println("Genre: ");
                String userGenre = input.next();

                controller.addMovie(userTitle, userDirector, userYearCreated, userIsInColor, userLengthInMinutes, userGenre);

                System.out.println("***Velkommen til menuen***");
                System.out.println("Tast 1; For at oprette en film");
                System.out.println("Tast 2; For at afslutte");
                System.out.println("Tast 3; For at se en liste over dine film");

                choice = input.nextInt();
            }
            if (choice == 3) {
                System.out.println(controller.showMovieCollection());

                System.out.println("***Velkommen til menuen***");
                System.out.println("Tast 1; For at oprette en film");
                System.out.println("Tast 2; For at afslutte");
                System.out.println("Tast 3; For at se en liste over dine film");

                choice = input.nextInt();
            }
            System.out.println("Du har afsluttet programmet");
        }
    }
}
