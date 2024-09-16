package gr11review.part1;

import java.io.*;


/**
 * Write a program that prompts for a yearly_amount, annual
 * compound_interest_rate, and outputs the number of years .
 * 
 * @author Gordon Z
 */

public class Review5 {

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
        double dblYearlyAmount; 
        double dblInterest;
        double dblTargetAmount;
        double dblCurrAmount = 0;
        int intYears = 0 ; 

        // Inputs
        System.out.print("Enter the yearly invested amount: ");
        dblYearlyAmount = Double.parseDouble(br.readLine());

        System.out.print("Enter the compound interest rate: ");
        dblInterest = Double.parseDouble(br.readLine());

        System.out.print("Enter the target amount: ");
        dblTargetAmount = Double.parseDouble(br.readLine());

        //Calculation for number of years needed
        while(dblCurrAmount<dblTargetAmount){
            dblCurrAmount+= dblYearlyAmount;
            dblCurrAmount += dblCurrAmount * (dblInterest/100);
            intYears++;
        }

        // Output the result
        System.out.println("The target amount will be earned in " + intYears + " years.");

        br.close();
        out.close();
    }
}