import java.util.ArrayList;

/**
 * Created by fhani on 7/7/2017.
 */
public class Movie {

    private String movieName;
    private String category;


    public String getMovieName() {

        return movieName;
    }

    public void setMovieName(String movieName) {

        this.movieName = movieName;
    }

    public String getCategory() {

        return category;
    }

    public void setCategory(String category) {

        this.category = category;
    }

    // blank constructor
    public Movie() {

    }

    //constructor with moviename and category
    public Movie(String movieName, String category) {
        this.category = category;
        this.movieName = movieName;


    }

    public String listOfMovies(String userInput) {
        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("Legally Blonde", "comedy"));
        list.add(new Movie("Zoolander", "comedy"));
        list.add(new Movie("The Bourne Ulitmatum", "action"));
        list.add(new Movie("Crazy, Stupid Love", "comedy"));
        list.add(new Movie("Godfather", "drama"));
        list.add(new Movie("Pulp Fiction", "drama"));
        list.add(new Movie("Fight Club", "drama"));
        list.add(new Movie("The Wizard of Oz", "musical"));
        list.add(new Movie("West Side Story", "musical"));
        list.add(new Movie("Skyfall", "action"));


        for (Movie testCheck : list) {
            if (testCheck.category.equalsIgnoreCase(userInput)) {
                System.out.println(testCheck.movieName);
                continue;

            }


        }  return "No more movies in this category";
    }

    @Override
    public String toString (){
        return movieName + " " + category;
    }
}
