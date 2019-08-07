
import java.util.Arrays;
import java.time.LocalDateTime;
import java.time.format.*;

public class Main {
  public static void main(String[] args){
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
    flipNHeads(2);
    //flipNHeads(3);
    clock();
  }

  public static String pluralize(String word, int number){
    if ((number == 0) || (number > 1)){
      return word + "s";
    } else {
      return word;
    }
  }

  public static void flipNHeads(int number){
    int headCount = 0;
    int flipCount = 0;
    boolean nHeadsFlipped = false;

    while (!nHeadsFlipped){
     double d = Math.random();
     flipCount++;
     if (d < 0.5) {
       System.out.println("tails");
       headCount = 0;
     } else {
       System.out.println("heads");
       headCount++; 
     }
     if (headCount == number){
       nHeadsFlipped = true;
       if ((headCount == 1) && (flipCount == 1)){
         System.out.println("It took " + flipCount + " flip to flip " + headCount + " head in a row");
       } else if (headCount == 1) {
         System.out.println("It took " + flipCount + " flips to flip " + headCount + " head in a row");
       } else {
       System.out.println("It took " + flipCount + " flips to flip " + headCount + " heads in a row");
       }
     }
    }
  }

  public static void clock(){
      int prevSecond = 0;
      int loopCounter = 0;
      int million = 1_000_000;

      while (true){
        ++loopCounter;
        LocalDateTime now = LocalDateTime.now();
        int second = now.getSecond();
        if (second != prevSecond) {          
          prevSecond = second;
          String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
          System.out.println(time + " " + (double)loopCounter/million + " MHz");
          loopCounter = 0;
        }
      }
  }
}