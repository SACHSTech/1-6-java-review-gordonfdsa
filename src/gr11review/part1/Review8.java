package gr11review.part1;

import java.util.*;
import java.io.*;

/**
 * A program that simulates 1000 pulls of a slot machine, such that 3 random
 * numbers (between 0 and 8) are generated for each pull. Output the result of
 * each pull on a single line (a space separating the 3 numbers) and the total
 * count of the number times a triple (all 3 numbers equal) was pulled.
 * 
 * @author Gordon Z
 */

public class Review8 {

    /**
     * Main method to execute the program logic 
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException input exceptions if error occurs 
     */
    public static void main(String[] args) throws IOException {

        // Initialization
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        Random random = new Random();
        int intTripleCount = 0; // To count the number of times a triple is pulled

        // Simulate 1000 pulls
        for (int i = 0; i < 1000; i++) {
            // Generate 3 random numbers between 0 and 8
            int intNumber1 = random.nextInt(9); 
            int intNumber2 = random.nextInt(9);
            int intNumber3 = random.nextInt(9);

            // Output the result of each pull
            out.println(intNumber1 + " " + intNumber2 + " " + intNumber3);

            // Check if all 3 numbers are equal
            if (intNumber1 == intNumber2 && intNumber2 == intNumber3) {
                intTripleCount++;
            }
        }

        // Outputs 
        out.println(intTripleCount);

        out.close();
    }
}