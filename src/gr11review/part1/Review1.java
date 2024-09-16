package gr11review.part1;

import java.io.*;


/**
 * Create a program that asks the user to enter a month number and day and then
 * prints the day of the year
 * 
 * @author Gordon Z
 */

public class Review1 {

    /**
     * Main method to execute the program logic 
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException input exceptions if error occurs 
     */

    public static void main(String[] args) throws IOException {

        //Initialization
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arrMonthToDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // Inputs
        System.out.print("Enter the month number: ");
        int intMonth = Integer.parseInt(br.readLine());
        System.out.print("Enter the day number: ");
        int intDay = Integer.parseInt(br.readLine());

        // Calculating the equivalent days for the month and add it to intDay
        for (int i = 0; i < intMonth - 1; i++) {
            intDay += arrMonthToDays[i];
        }

        // Output
        System.out.println(intDay);

        br.close();
    }
}