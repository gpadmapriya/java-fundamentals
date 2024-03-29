/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import java.util.*;

public class Library {
    public static int[] roll(int number) {
        int numberRolled = 0;
        int[] allNumbersRolled = new int[number];
        for (int i = 0; i < number; i++){
            numberRolled = (int)Math.ceil(Math.random()*6);
            allNumbersRolled[i] = numberRolled;
        }
        return allNumbersRolled;
    }

    public static boolean containsDuplicates(int[] number) {
    for (int i = 0; i < number.length; i++){
        for (int j = i + 1; j < number.length; j++){
            /* use .equals if it is a string array */
            if (number[i] == number[j]){
                return true;
            }
        }
    }
    return false;
    }

    public static int returnAverage(int[] number){
        int sum = 0;
        for (int i = 0; i < number.length; i++){
            sum = sum + number[i];
        }
        int average = sum / number.length;
        return average;
    }

    /* Helper function for returnLowestAverage */
    public static double returnAverageDouble(int[] number){
        double sum = 0;
        for (int i = 0; i < number.length; i++){
            sum = sum + number[i];
        }
        double average = sum / number.length;
        return average;
    }
    public static int[] returnLowestAverage(int[][] number){
        int index = 0;
        double[] averageArray = new double[number.length];
        for (int i = 0; i < number.length; i++ ){
            averageArray[i] = returnAverageDouble(number[i]);
        }
        for (int j = 0; j < averageArray.length; j++){
            for (int k = j + 1; k < averageArray.length; k++) {
                if (averageArray[k] < averageArray[j]) {
                    index = k;
                } else {
                    index = j;
                }
            }
        }
        return number[index];
    }

    public static String analyzeWeatherData(int[][] temperature){
        HashSet<Integer> distinctTemperatures = new HashSet<Integer>();
        String returnString = "";
        for (int i = 0; i < temperature.length; i++){
            for (int j = 0; j < temperature[i].length; j++) {
                distinctTemperatures.add(temperature[i][j]);
            }
        }
        int maxTemperature = Collections.max(distinctTemperatures);
        int minTemperature = Collections.min(distinctTemperatures);

        returnString = returnString + "High: " + maxTemperature + "\n";
        returnString = returnString + "Low: " + minTemperature + "\n";

        for (int i = minTemperature; i <= maxTemperature; i++){
            if (!(distinctTemperatures.contains(i))) {
                returnString = returnString + "Never saw temperature: " + i + "\n";
            }
        }

        return returnString.trim();

    }

    public static String tally(List<String> votes) {
        String returnString = "";
        HashMap<String,Integer> voteCount = new HashMap<String,Integer>();
        int count = 0;
        for (String plant : votes) {
            if (voteCount.containsKey(plant)) {
                //https://stackoverflow.com/questions/4157972/how-to-update-a-value-given-a-key-in-a-hashmap
                voteCount.put(plant, voteCount.get(plant) + 1);
            } else {
                voteCount.put(plant, 1);
            }
        }

        //https://stackoverflow.com/questions/49470423/get-the-highest-values-in-a-hashmap-in-java
        int maxCount = 0;
        for (Map.Entry x : voteCount.entrySet()){
            if ((int)x.getValue() > maxCount) {
                maxCount = (int)x.getValue();
                returnString = (String)x.getKey();
            }
        }

        return returnString + " received the most votes!";
    }
}
