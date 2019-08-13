package inheritance;

import java.util.*;

public class Restaurant {
    private String restaurantName;
    private int numberOfStars;
    private int priceCategory;
    private List<RestaurantReview> reviews = new ArrayList<RestaurantReview>();

    public Restaurant(String restaurantName, int numberOfStars, int priceCategory){
        this.restaurantName = restaurantName;
        this.numberOfStars = numberOfStars;
        this.priceCategory = priceCategory;
    }

    public List<RestaurantReview> getReviews() {
        return reviews;
    }

    public void setReviews(List<RestaurantReview> reviews) {
        this.reviews = reviews;
    }

    public String getRestaurantName(){
        return this.restaurantName;
    }

    public void setRestaurantName(String restaurantName){
        this.restaurantName = restaurantName;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }

    public String toString(){
        String priceCategory = "";
        switch (this.priceCategory){
            case 1 :
                priceCategory = "$ (range: $1 to $10 per person)";
            case 2 :
                priceCategory = "$$ (range: $11 to $20 per person)";
            case 3 :
                priceCategory = "$$$ (range: $21 to $30 per person)";
            case 4 :
                priceCategory = "$$$$ (range: $31+ per person) ";
            default:
                priceCategory = "$ (range: $1 to $10 per person)";
        }
        String returnString = "The rating for " + this.restaurantName + " is " + this.numberOfStars + " stars\n" + "Price Category: " + priceCategory + "\n";

        if (this.getReviews() != null) {
            for (RestaurantReview r : reviews) {
                returnString = returnString + r.toString() + "\n";
            }
        }
        return returnString;
    }

    public void addReview(Review newReview){
        String authorName = newReview.getAuthorName();
        int numberOfStars = newReview.getNumberOfStars();
        String reviewText = newReview.getReviewText();
        String restaurantName = this.getRestaurantName();

        RestaurantReview newRestaurantReview = new RestaurantReview(authorName,numberOfStars, reviewText, restaurantName);
        this.reviews.add(newRestaurantReview);
        this.setNumberOfStars(numberOfStars);

    }

}

