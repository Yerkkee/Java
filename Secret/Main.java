import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
	    // write your code here
        Scanner scanner = new Scanner(new File("secret.txt")); // Reads the file and places it in the scanner object
        String line="";
        StringBuilder str = new StringBuilder(); // Creates an StringBuilder object

        while (scanner.hasNextLine()) { // Reads from a file until the next line is empty
            line = scanner.nextLine();
        }
        String[] tokens= line.split(" ");// Creates an array of words from a string
        int i=0; // Create an integer to count each word from a string
        for (String s : tokens){ //Does the loop for each word
            i++;
            if(i==1 || i%5==0) str.append(s.substring(0,1).toUpperCase());
            // Checks the first letter of every fifth word
            // Adds first letter and uses uppercase word to StringBuilder.
        }
        System.out.println(str.toString());
        // Does StringBuilder object convert string after printing to console
    }
}
