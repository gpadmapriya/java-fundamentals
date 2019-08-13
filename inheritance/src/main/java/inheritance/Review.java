package inheritance;

public class Review {
    private String authorName;
    private int numberOfStars;
    private String reviewText;

    public Review(){
        this.authorName = "No reviews yet";
        this.numberOfStars = 0;
        this.reviewText = "No reviews yet";
    }
    public Review(String authorName, int numberOfStars, String reviewText){
        this.authorName = authorName;
        this.numberOfStars = numberOfStars;
        this.reviewText = reviewText;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public String toString(){
        String returnString = "";
        returnString = "Review by: " + this.authorName + "\nRating: " + this.numberOfStars + " stars\nComments: " + this.reviewText;
        return returnString;
    }
}
