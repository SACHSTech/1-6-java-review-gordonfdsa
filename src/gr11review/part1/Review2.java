package gr11review.part1;


import java.io.*;

/**
 * A program that prints out a statement of options. Allow the user to select an
 * option for a joke and prints the joke based on
 * selection.
 * 
 * @author Gordon Z
 */

public class Review2 {

    /**
     * Main method to execute the program logic
     * 
     * @param args Command-line arguments (not used)
     * @throws IOException input exceptions if error occurs
     */

    public static void main(String[] args) throws IOException {

        // Initialization
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Printing Instructions
        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes");
        System.out.println("3 - print a joke about your teacher");

        System.out.print("Choose a menu option: ");

        // Inputs
        int intOption = Integer.parseInt(br.readLine());

        // Outputs based on user selection
        switch (intOption) {
            case 0:
                // joke about hair
                System.out.println("I was going to make a joke about my hair\nBut its a bit over my head!");
                break;
            case 1:
                // joke about feet
                System.out.println("My feet would make great comedians\nthey really know how to nail the punchline.");
                break;
            case 2:
                // joke about clothes
                System.out.println(
                        "Why does my clothes and I have an agreement?\nI wear them, and they wrinkle in protest.");
                break;
            case 3:
                // joke about teacher
                System.out.println("Why did the music teacher need a ladder?\nTo reach the high notes.");
                break;
            default:
                // invalid option
                System.out.println("Invalid menu option");
                break;
        }

        br.close();
    }
}