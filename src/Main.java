import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/*
*
Option #1: Get Weekly Temperatures

Develop a Java program that will store data in the form of daily average temperatures for one week.
* Store the day and average temperature in two different arraylists. Your program should prompt the
* user for the day of the week (Monday through Sunday) and display both the day and temperature for
* each day. If "week" is entered, the output for your program should provide the temperature for each
* day and the weekly average. Use the looping and decision constructs in combination with the arrays to
* complete this assignment.

Compile and submit your pseudocode, source code, and screenshots of the application executing the application, the results and GIT repository in a single document.

* */
public class Main {

    public static void main(String[] args) {
        ArrayList<Double> temperatures = new ArrayList<Double>(Arrays.asList(90.2, 93.2, 91.5, 90.3, 89.3, 85.9, 87.8));
        ArrayList<String> weekDays = new ArrayList<String>(Arrays.asList(
                "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"
        ));

        System.out.println("Enter the day of the week to see it's average temperature: ");
        Scanner userInput = new Scanner(System.in);
        String userChoice = userInput.nextLine();

        Double temp = null;
        switch (userChoice.toLowerCase()) {
            case "sunday":
                temp = temperatures.get(0);
                break;
            case "monday":
                temp = temperatures.get(1);
                break;
            case "tuesday":
                temp = temperatures.get(2);
                break;
            case "wednesday":
                temp = temperatures.get(3);
                break;
            case "thursday":
                temp = temperatures.get(4);
                break;
            case "friday":
                temp = temperatures.get(5);
                break;
            case "saturday":
                temp = temperatures.get(6);
                break;
            case "week":
                temp = null;
                break;
            default:
                temp = null;
        }
        
        if (temp == null) {
            for (int i = 0; i < temperatures.size(); i++) {
                System.out.println(weekDays.get(i) + " : " + temperatures.get(i));
            }
        } else {
            System.out.println("Temperature for " + userChoice.toUpperCase() + " : " + temp);
        }
    }
}