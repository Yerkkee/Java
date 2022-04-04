import java.io.*;

/**
   Name: Yerkebulan Zhaiylkan
   Date: 24.11.2021
   This program creates a list of songs for a CD
   by reading from a file.
*/

public class CompactDisc
{
   public static void main(String[] args)throws IOException
   {
      FileReader file = new FileReader("Classics.txt");
      BufferedReader input = new BufferedReader(file);
      String title;
      String artist;
      // ADD LINES FOR TASK #3 HERE
      // Declare an array of Song objects, called cd,
      // with a size of 6
      Song[]cd = new Song[6];

      for (int i = 0; i < cd.length; i++)
      {
         title = input.readLine();
         artist = input.readLine();
         cd[i] = new Song(title,artist);
         // ADD LINES FOR TASK #3 HERE
         // Fill the array by creating a new song with
         // the title and artist and storing it in the
         // appropriate position in the array
      }

      System.out.println("Contents of Classics:");
      for (int i = 0; i < cd.length; i++)
      {
         System.out.print(cd[i].toString());
         // ADD LINES FOR TASK #3 HERE
         // Print the contents of the array to the console
      }
   }
}