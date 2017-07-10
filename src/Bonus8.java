import java.util.Scanner;

/**
 * Created by fhani on 7/7/2017.
 */
public class Bonus8 {
    public static void main(String[] args) {
        String keepGoing = "";
        System.out.println("Welcome to the Movie List Application!");
        System.out.println();

        do {

            System.out.println("There are 10 movies in this list.");
            System.out.println();

            System.out.println("What category are you interested in?");
            Scanner scnr = new Scanner(System.in);
            String userInput = scnr.next();
            System.out.println();

            while (!userInput.equalsIgnoreCase("comedy") && (!userInput.equalsIgnoreCase("drama")) && (!userInput.equalsIgnoreCase("action")) && (!userInput.equalsIgnoreCase("musical"))) {
                System.out.println("Invalid Input. Please select from the following: Comedy, Drama, Action, Musical:  ");
                userInput = scnr.nextLine();
            }

            Movie list = new Movie();

            //System.out.println("Movies in this category: " + list.listOfMovies(userInput)); -- why won't this work??
            System.out.println("Movies in this category:");
            System.out.println();
            list.listOfMovies(userInput);


            //can't get return statement to not print with the method...

            System.out.println();
            System.out.println("Would you like to continue? (Y/N)");
            keepGoing = scnr.next();
        } while (keepGoing.equalsIgnoreCase("y") && (!keepGoing.equalsIgnoreCase("N")));

    }
}
