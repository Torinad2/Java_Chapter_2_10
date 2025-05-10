/********************************************************
 * Test Average Calculator                              *
 * This program prompts the user to enter three test    *
 * scores, calculates the average, and displays each    *
 * score along with the average.                        *
 ********************************************************/

import java.util.Scanner;

public class TestAverage {

    /********************************************************
     * Main Method                                          *
     * Prompts the user for three test scores, calculates   *
     * the average, and displays the results.               *
     ********************************************************/
    public static void main(String[] args) {

        //***********************************************
        // Variable Declarations                        *
        // To store user input and calculated values    *
        //***********************************************
        double testScore1;          // First test score
        double testScore2;          // Second test score
        double testScore3;          // Third test score
        double averageScore;        // Calculated average score

        //************************************************
        // Input Section                                 *
        // Prompting the user to enter three test scores *
        //************************************************
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter the first test score: ");
        testScore1 = keyboardInput.nextDouble();

        System.out.print("Enter the second test score: ");
        testScore2 = keyboardInput.nextDouble();

        System.out.print("Enter the third test score: ");
        testScore3 = keyboardInput.nextDouble();

        //************************************************
        // Calculation Section                           *
        // Calculate the average of the three test scores*
        //************************************************
        averageScore = (testScore1 + testScore2 + testScore3) / 3;

        //************************************************
        // Output Section                                *
        // Display each score and the average            *
        //************************************************
        System.out.println();
        System.out.printf("%-25s %.2f\n", "Test Score 1:", testScore1);
        System.out.printf("%-25s %.2f\n", "Test Score 2:", testScore2);
        System.out.printf("%-25s %.2f\n", "Test Score 3:", testScore3);
        System.out.printf("%-25s %.2f\n", "Average Score:", averageScore);

        //************************************************
        // Developer Credit                              *
        //************************************************
        System.out.println("\nDeveloped by: Nikita Baiborodov");

        //************************************************
        // Resource Cleanup                              *
        // Close the scanner to prevent resource leaks   *
        //************************************************
        keyboardInput.close();
        System.exit(0);
    }
}
