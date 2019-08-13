### Java Fundamentals labs
[Day1 Labs - Main.java](https://github.com/gpadmapriya/java-fundamentals/tree/master/basics)
- Feature Task 1 - pluralize()
  - Method that accepts a word and a number and returns a string with word pluralized if number is 0 or greater than 1 
- Feature Task 2 - flipNHeads()
  - Method that accepts an integer n and flips a coin until n heads are flipped in a row
- Feature Task 3 - clock()
  - Method that uses java's built-in LocalDateTime object to constantly print out the current time to the console, second by second until execution is stopped with CTRL-C. 
  - Stretch goal - upgrade the command line clock to show how fast the program is processing itself.

[Day2 - basiclibrary](https://github.com/gpadmapriya/java-fundamentals/tree/master/basiclibrary)
- Roll dice n times, return an array with rolled values - roll(n)
- Check if an input int array contains duplicates - containsDuplicates(int[])
- calculate the average of an array of integers - returnAverage(int[])
- Array of arrays - given an array of arrays calculate average for each array and return the array with the lowest average

[Day3 - Maps](https://github.com/gpadmapriya/java-fundamentals/tree/master/basiclibrary)
- Analyze weather data, print max and min temperatures and any temperature not seen in the month - analyzeWeatherData(int[][])
- Tallying Election - Function that accepts a list of strings representing votes and returns the winner - tally(List<>)

[Day3 - File I/O](https://github.com/gpadmapriya/java-fundamentals/tree/master/linter)
- Method that reads a java script file with a given path and generates an error message when it finds a line that does not end in semicolon.

[Inheritance](https://github.com/gpadmapriya/java-fundamentals/tree/master/inheritance)
- Create classes and use inheritance to represent reviews of restaurants.
- Create a Restaurant class and a Review class
- I chose to implement this using inheritance rather than an interface.
- Create a RestaurantReview class that inherits from Review.
- Have a list of RestaurantReviews as a property in Restaurant class.
- Create a new RestaurantReview and add it to the list in addReview(Review newReview) method
- To test
  - Restaurant constructor(String restaurantName, int numberOfStars, int priceCategory)
  - Review constructor(String authorName, int numberOfStars, String reviewText)
  - RestaurantReview constructor(String authorName, int numberOfStars, String reviewText, String restaurantName)
  - Instantiate a restaurant object, a review object and call addReview(review) on the restaurant instance passing in the review instance.
  - Call toString() on the restaurant instance to get all information.
        
