package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theatre implements Reviewable{
    private String theatreName;
    private List<String> movies = new ArrayList<String>();
    private List<Review> reviews = new ArrayList<Review>();

    public Theatre(String theatreName){
        this.theatreName = theatreName;
    }
    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public List<String> getMovies() {
        return movies;
    }

    public void setMovies(List<String> movies) {
        this.movies = movies;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public void addMovie(String movie){
        this.movies.add(movie);

    }

    public String removeMovie(String movie) {
        List<String> nowPlaying = this.getMovies();
        String returnString = "";
        if (nowPlaying.contains(movie)) {
            this.movies.remove(movie);
            returnString = "Movie Removed";
        } else
        {
            returnString = "Movie is currently not playing";
        }
        return returnString;
    }
    public String toString(){
        String returnString = "Theatre Name: " + this.theatreName + "\n";
        List<String> nowPlaying = this.getMovies();
        if (!this.getReviews().isEmpty()) {
            for (Review r : reviews) {
                returnString = returnString + r.toString(r) + "\n";
            }
        }

        if (!nowPlaying.isEmpty()) {
            returnString = returnString + "Now playing in " + this.theatreName + "\n";
            int counter = 0;
            for (String movie: movies) {
                counter++;
                returnString = returnString + counter + ". " + movie + "\n";

            }
        } else {
            returnString = returnString + "No Movies playing currently";
        }

        return returnString;
    }
    @Override
    public void addReview(Review review){
        this.reviews.add(review);
    }

}
