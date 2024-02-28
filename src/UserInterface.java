import java.util.Scanner;

public class UserInterface {
    //Formål at overtage prompts og andre UI-elementer fra main, så main blot er entry point til programmet
    Scanner input = new Scanner(System.in);
    Controller controller = new Controller();
    public void startProgram() {
        input.useDelimiter("\n");
        int sentinel = 2;
        int choice = 0;

        while (choice != sentinel) {
            showMenu();
            choice = input.nextInt();

            if (choice == 1) {
               addMovie();
            } else if (choice == 3) {
                showAllMovies();
            } else if (choice == 4) {
                searchMovies();
            } else if (choice == 5) {
                editMovie();
            } else if (choice == sentinel) {
                System.out.println("Du har afsluttet programmet");
            }
        }
    }

        public void showMenu() {
            System.out.println("Velkommen til din filmsamling");
            System.out.println("Tast 1; For at oprette en film");
            System.out.println("Tast 2; For at afslutte");
            System.out.println("Tast 3; For at se en liste over dine film");
            System.out.println("Tast 4: For at søge i din filmkollektion");
            System.out.println("Tast 5: For at redigere i film");
        }
        public void addMovie(){
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

            if (farve.equals("ja")) {
                userIsInColor = true;
            }

            System.out.println("Filmens længde i minutter: ");
            int userLengthInMinutes = input.nextInt();
            System.out.println("Genre: ");
            String userGenre = input.next();

            controller.addMovie(userTitle, userDirector, userYearCreated, userIsInColor, userLengthInMinutes, userGenre);
        }
        public void showAllMovies(){
            System.out.println("\nFilmliste\n");
            System.out.println(controller.showMovieCollection());
        }

        public void searchMovies(){
            System.out.println("Du har valgt at tilgå søgefunktionen ");
            System.out.println("Indtast et eller flere bogstaver af en filmtitel: ");

            String searchWord = input.next();
            System.out.println(controller.showSearchMovie(searchWord));
        }

        public void editMovie(){

        }

}
