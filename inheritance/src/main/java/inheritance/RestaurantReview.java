package inheritance;

public class RestaurantReview extends Review {
    private String restaurantName;
    public RestaurantReview(String authorName, int numberOfStars, String reviewText, String restaurantName) {
        super(authorName, numberOfStars, reviewText);
        this.restaurantName = restaurantName;
    }

    public String getRestaurantName() {
        return this.restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
    public String toString(){
        String returnString = "";
        returnString = "Review of " + this.restaurantName + " by: " + this.getAuthorName() + "\nRating: " + this.getNumberOfStars() + " stars\nComments: " + this.getReviewText();
        return returnString;
    }
}
