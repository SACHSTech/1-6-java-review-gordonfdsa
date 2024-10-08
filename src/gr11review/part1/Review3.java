package gr11review.part1;

import java.io.*;


/**
 * Program that prints the odd numbers from 20 to 100 and prints the numbers
 * from 29 to 2(assuming inclusive) in decreasing order.
 * 
 * @author Gordon Z
 */

public class Review3 {

    /**
     * Main method to execute the program logic 
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException input exceptions if error occurs 
     */

    public static void main(String[] args) throws IOException {

        // Initialization
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        // Output odd numbers from 20-100
        for (int i = 21; i < 100; i += 2) {
            out.println(i);
        }
        //Empty Spacing
        out.println();

        // Output numbers from 29-2 decreasing
        for (int i = 29; i >= 2; i--) {
            out.println(i);
        }

        out.close();
    }
}