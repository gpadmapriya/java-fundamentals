package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Reviewable{
    private String shopName;
    private String shopDescription;
    private int priceCategory;
    private List<Review> reviews = new ArrayList<Review>();

    public Shop(String shopName, String shopDescription, int priceCategory){
        this.shopName = shopName;
        this.shopDescription = shopDescription;
        this.priceCategory = priceCategory;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopDescription() {
        return shopDescription;
    }

    public void setShopDescription(String shopDescription) {
        this.shopDescription = shopDescription;
    }

    public int getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(int priceCategory) {
        this.priceCategory = priceCategory;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public String toString(){

        String priceCategory = "";

        switch (this.priceCategory){
            case 1 :
                priceCategory = "$ (cheap: try often)";
                break;
            case 2 :
                priceCategory = "$$ (moderate: why not?)";
                break;
            case 3 :
                priceCategory = "$$$ (tolerable: occasional use)";
                break;
            case 4 :
                priceCategory = "$$$$ (expensive: don't even think about it) ";
                break;
            default:
                priceCategory = "$ (cheap: try often)";
        }
        String returnString = "Shop Name: " + this.shopName + "\nShop Description: " + this.shopDescription + "\nPrice Category: " + priceCategory + "\n";
        if (this.getReviews() != null) {
            for (Review r : reviews) {
                returnString = returnString + r.toString(r) + "\n";
            }
        }
        return returnString;
    }

    @Override
    public void addReview(Review review) {
        this.reviews.add(review);
    }

}
