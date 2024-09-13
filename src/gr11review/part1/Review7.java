package gr11review.part1;

import java.util.*;
import java.io.*;
import java.lang.Math.*;
import java.text.DecimalFormat;

/**
 * A program that will input a sentence from the user and store it in a String
 * variable called theSentence. It will output the characters, spaces, amount of
 * letter 'a' and '-' for every odd character
 * 
 * @author Gordon Z
 */

public class Review7 {

    public static void main(String[] args) throws IOException {

        // Initialization
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        //Inputs
        String strTheSentence; 
        strTheSentence = br.readLine();

        // 1. Output number of characters in the sentence
        out.println("There are " + strTheSentence.length() + " characters in the sentence.");


        // 2. Output number of spaces in the sentence
        int spaceCount = 0;
        for (int i = 0; i < strTheSentence.length(); i++) {
            if (strTheSentence.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        out.println("There are " + spaceCount + " spaces in the sentence.");


        // 3. Output number of 'a' letters in the sentence
        int aCount = 0;
        for (int i = 0; i < strTheSentence.length(); i++) {
            if (strTheSentence.charAt(i) == 'a') {
                aCount++;
            }
        }
        out.println("There are " + aCount + " letter a in the sentence.");

        
        // 4. Output odd-numbered characters as '-' in the sentence
            if(strTheSentence.length()%2==0){
                //String is even length
                for(int i = 0 ; i < strTheSentence.length()/2; i++){
                    out.print("-");
                }
            }else{
                //String is odd length
                for(int i = 0 ; i < (strTheSentence.length()+1)/2; i++){
                    out.print("-");
                }
            }
            out.println();
     

        br.close();
        out.close();
    }
}