package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void testCreateRestaurant(){
        Restaurant r = new Restaurant("test", 2, 3);
        String returnString = r.toString();
        assertEquals("The rating for test is 2 stars\nPrice Category: $ (range: $1 to $10 per person)\n", returnString);

    }

    @Test
    public void testCreateReview(){
        Review newReview = new Review("Author", 2, "Test Review");
        String returnString = newReview.toString();
        assertEquals("Review by: Author\n" +
                "Rating: 2 stars\n" +
                "Comments: Test Review", returnString);

    }

    @Test
    public void testCreateRestaurantReview(){
        //associate review to restaurant
        RestaurantReview newReview = new RestaurantReview("Author", 2, "Test Review", "Test");
        String returnString = newReview.toString();
        assertEquals("Review of Test by: Author\n" +
                "Rating: 2 stars\n" +
                "Comments: Test Review", returnString);

    }

    @Test
    public void testAddReview(){
        //associate review to restaurant
        Restaurant r = new Restaurant("test", 2, 3);
        Review newReview = new Review("Author", 2, "Test Review");
        Review anotherReview = new Review("AnotherPerson", 3, "One more Test Review");
        r.addReview(newReview);
        r.addReview(anotherReview);
        String returnString = r.toString();
        assertEquals("The rating for test is 3 stars\n" +
                "Price Category: $ (range: $1 to $10 per person)\n" +
                "Review of test by: Author\n" +
                "Rating: 2 stars\n" +
                "Comments: Test Review\n" +
                "Review of test by: AnotherPerson\n" +
                "Rating: 3 stars\n" +
                "Comments: One more Test Review\n", returnString);

    }
    @Test
    public void testRatingDoesNotUpdate(){
        //associate review to restaurant
        Restaurant r = new Restaurant("test", 2, 3);
        Review newReview = new Review("Author", 2, "Test Review");
        Review anotherReview = new Review("AnotherPerson", 3, "One more Test Review");
        Review oneMoreReview = new Review("AnotherPerson", 3, "More Test Reviews");
        r.addReview(newReview);
        r.addReview(anotherReview);
        r.addReview(oneMoreReview);
        String returnString = r.toString();
        assertEquals("The rating for test is 3 stars\n" +
                "Price Category: $ (range: $1 to $10 per person)\n" +
                "Review of test by: Author\n" +
                "Rating: 2 stars\n" +
                "Comments: Test Review\n" +
                "Review of test by: AnotherPerson\n" +
                "Rating: 3 stars\n" +
                "Comments: One more Test Review\n" + "Review of test by: AnotherPerson\n" +
                "Rating: 3 stars\n" +
                "Comments: More Test Reviews\n", returnString);

    }
}
