package gr11review.part1;

import java.util.*;
import java.io.*;
import java.lang.Math.*;
import java.text.DecimalFormat;

/**
 * Write a program that prompts for a yearly_amount, annual
 * compound_interest_rate, and outputs the number of years .
 * 
 * @author Gordon Z
 */

public class Review5 {

    public static void main(String[] args) throws IOException {

        // Initialization
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        DecimalFormat df = new DecimalFormat("0.00");

        

        out.flush();
        br.close();
        out.close();
    }
}