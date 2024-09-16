package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

/**
 * The program gets the prices for the items user would like to purchase one by
 * one. The user is able to keep entering item prices until the enter is 0. At the
 * end of entering items, print out the total, the tax (13%) and the grand total.
 * 
 * @author Gordon Z
 */

public class Review6 {

    /**
     * Main method to execute the program logic 
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException input exceptions if error occurs 
     */

    public static void main(String[] args) throws IOException {

        // Initialization
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        DecimalFormat df = new DecimalFormat("0.00");

        // Variables
        double dblPrice = 0;
        double dblSubTotal = 0;
        double dblTax;

        //While loop for input
        while(true){
            out.print("Enter the price for an item: ");
            out.flush();

            //Inputting the new price
            dblPrice = Double.parseDouble(br.readLine());
            if(dblPrice==0){
                break;
            }
            // adding new price to subtotal
            dblSubTotal += dblPrice; 

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