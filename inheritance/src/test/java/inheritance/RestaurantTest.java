package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void testCreateRestaurant(){
        Restaurant r = new Restaurant("test", 2, 3);
        String returnString = r.toString();
        assertEquals("The rating for test is 2 stars\nPrice Category: $$$ (range: $21 to $30 per person)\n", returnString);

    }

    @Test
    public void testCreateReview(){
        Review newReview = new Review("Author", 2, "Test Review");
        String returnString = newReview.toString(newReview);
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
                "Price Category: $$$ (range: $21 to $30 per person)\n" +
                "Review by: Author\n" +
                "Rating: 2 stars\n" +
                "Comments: Test Review\n" +
                "Review by: AnotherPerson\n" +
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
                "Price Category: $$$ (range: $21 to $30 per person)\n" +
                "Review by: Author\n" +
                "Rating: 2 stars\n" +
                "Comments: Test Review\n" +
                "Review by: AnotherPerson\n" +
                "Rating: 3 stars\n" +
                "Comments: One more Test Review\n" +
                "Review by: AnotherPerson\n" +
                "Rating: 3 stars\n" +
                "Comments: More Test Reviews\n", returnString);

    }

    @Test
    public void testCreateShop(){
        Shop newShop = new Shop("Test shop Name", "Test Shop Description", 3);
        String returnString = newShop.toString();
        assertEquals("Shop Name: Test shop Name\n" +
                "Shop Description: Test Shop Description\n" +
                "Price Category: $$$ (tolerable: occasional use)\n", returnString);

    }
    @Test
    public void testReviewShop(){
        //associate review to shop
        Shop newShop = new Shop("Test shop Name", "Test Shop Description", 3);
        Review newReview = new Review("Test Author Name", 4, "Test Review Text");
        newShop.addReview(newReview);
        String returnString = newShop.toString();
        assertEquals("Shop Name: Test shop Name\n" +
                "Shop Description: Test Shop Description\n" +
                "Price Category: $$$ (tolerable: occasional use)\n" +
                "Review by: Test Author Name\n" +
                "Rating: 4 stars\n" +
                "Comments: Test Review Text\n", returnString);

    }
    @Test
    public void testCreateTheatre(){
        Theatre newTheatre = new Theatre("Test Theatre Name");
        String returnString = newTheatre.toString();
        assertEquals("Theatre Name: Test Theatre Name\n" +
                "No Movies playing currently", returnString);

    }
    @Test
    public void testAddMovies(){
        Theatre newTheatre = new Theatre("Test Theatre Name");
        newTheatre.addMovie("test movie");
        newTheatre.addMovie("another test movie");
        newTheatre.addMovie("one more test movie");
        String returnString = newTheatre.toString();
        assertEquals("Theatre Name: Test Theatre Name\n" +
                "Now playing in Test Theatre Name\n" +
                "1. test movie\n" +
                "2. another test movie\n" +
                "3. one more test movie\n", returnString);

    }
    @Test
    public void testRemoveMovieNotPlaying(){
        Theatre newTheatre = new Theatre("Test Theatre Name");
        newTheatre.addMovie("test movie");
        newTheatre.addMovie("another test movie");
        newTheatre.addMovie("one more test movie");
        String returnString = newTheatre.removeMovie("Not in the list movie");
        assertEquals("Movie is currently not playing", returnString);

    }
    @Test
    public void testRemoveMoviePlaying(){
        Theatre newTheatre = new Theatre("Test Theatre Name");
        newTheatre.addMovie("test movie");
        newTheatre.addMovie("another test movie");
        newTheatre.addMovie("one more test movie");
        String returnString = newTheatre.removeMovie("another test movie");
        assertEquals("Movie Removed", returnString);

    }
    @Test
    public void testTheatreToStringAfterRemovingMovie(){
        Theatre newTheatre = new Theatre("Test Theatre Name");
        newTheatre.addMovie("test movie");
        newTheatre.addMovie("another test movie");
        newTheatre.addMovie("one more test movie");
        newTheatre.removeMovie("another test movie");
        String returnString = newTheatre.toString();
        assertEquals("Theatre Name: Test Theatre Name\n" +
                "Now playing in Test Theatre Name\n" +
                "1. test movie\n" +
                "2. one more test movie\n", returnString);

    }
    @Test
    public void testReiewTheatreWithoutMovieName(){
        Theatre newTheatre = new Theatre("Test Theatre Name");
        Review newReview = new Review("Test Author Name", 4, "Test Review Text");
        newTheatre.addReview(newReview);
        newTheatre.addMovie("test movie");
        newTheatre.addMovie("another test movie");
        String returnString = newTheatre.toString();
        assertEquals("Theatre Name: Test Theatre Name\n" +
                "Review by: Test Author Name\n" +
                "Rating: 4 stars\n" +
                "Comments: Test Review Text\n" +
                "Now playing in Test Theatre Name\n" +
                "1. test movie\n" +
                "2. another test movie\n", returnString);

    }
    @Test
    public void testReiewTheatreWithMovieName(){
        Theatre newTheatre = new Theatre("Test Theatre Name");
        Review newReview = new Review("Test Author Name", 4, "Test Review Text", "test movie");
        newTheatre.addReview(newReview);
        newTheatre.addMovie("test movie");
        newTheatre.addMovie("another test movie");
        String returnString = newTheatre.toString();
        assertEquals("Theatre Name: Test Theatre Name\n" +
                "Review by: Test Author Name\n" +
                "Rating: 4 stars\n" +
                "Comments: Test Review Text\n" +
                "Movie Name: test movie\n" +
                "Now playing in Test Theatre Name\n" +
                "1. test movie\n" +
                "2. another test movie\n", returnString);

    }
}
