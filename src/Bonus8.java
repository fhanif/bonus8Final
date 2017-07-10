import java.util.Scanner;

/**
 * Created by fhani on 7/7/2017.
 */
public class Bonus8 {
    public static void main(String[] args) {
        String keepGoing = "";
        System.out.println("Welcome to the Movie List Application!");
        do {
            System.out.println("Welcome to the Movie List Application!");
            System.out.println("There are 10 movies in this list.");

            System.out.println("What category are you interested in?");
            Scanner scnr = new Scanner(System.in);
            String userInput = scnr.next();
            Movie list = new Movie();

            System.out.println("Movies in this category: " + list.listOfMovies(userInput));
            //can't get return statement to not print with the method...

            System.out.println("Would you like to continue? (Y/N)");
            keepGoing = scnr.next();
        } while (keepGoing.equalsIgnoreCase("y") && (!keepGoing.equalsIgnoreCase("N")));

    }
}
