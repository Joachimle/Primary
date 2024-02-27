import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        Controller controller = new Controller();


        int sentinel = 2;
        int choice = 0;

        while (choice != sentinel) {
            System.out.println("Velkommen til din filmsamling");
            System.out.println("Tast 1; For at oprette en film");
            System.out.println("Tast 2; For at afslutte");
            System.out.println("Tast 3; For at se en liste over dine film");
            System.out.println("Tast 4: For at søge i din filmkollektion");

            choice = input.nextInt();

            if (choice == 1){
                System.out.println("For at tilføje en film, indtast venligst følgende: ");
                System.out.println("Titel: ");
                String userTitle = input.next();
                System.out.println("Instruktør: ");
                String userDirector = input.next();
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

            }
            if (choice == 3) {
                System.out.println("\nFilmliste\n");
                System.out.println(controller.showMovieCollection());

            }
            if (choice == 4) {
                System.out.println("Du har valgt at tilgå søgefunktionen ");
                System.out.println("Indtast et eller flere bogstaver af en filmtitel: ");

                String searchWord = input.next();
                System.out.println(controller.showSearchMovie(searchWord));
            }
        }
        System.out.println("Du har afsluttet programmet");
    }
}

