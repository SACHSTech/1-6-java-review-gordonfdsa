package gr11review.part1;

import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

/**
 * Asks the user how many items he/she would like to purchase. The program then
 * gets the prices for the items one by one. At the end of entering items, print
 * out the total, the tax (13%) and the grand total.
 * 
 * @author Gordon Z
 */

public class Review4 {

    public static void main(String[] args) throws IOException {

        // Initialization
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        DecimalFormat df = new DecimalFormat("0.00");

        // Variables
        int intItems;
        double dblSubTotal = 0;
        double dblTax;

        // Inputs
        out.print("How many items do you want to buy? ");
        out.flush();
        intItems = Integer.parseInt(br.readLine());

        // Getting the items
        for (int i = 0; i < intItems; i++) {
            out.print("Enter the price for item " + (i + 1) + ": ");
            out.flush();
            // adding new price to subtotal
            dblSubTotal += Double.parseDouble(br.readLine());
        }

        // calculating tax
        dblTax = 0.13 * dblSubTotal;

        // Outputs
        out.println("Subtotal: $" + df.format(dblSubTotal));
        out.println("Tax: $" + df.format(dblTax));
        out.println("Total: $" + df.format(dblSubTotal + dblTax));

        out.flush();
        br.close();
        out.close();
    }
}