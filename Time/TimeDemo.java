import java.util.Scanner;

/**
  Name: Yerkebulan Zhaiylkan
  University: Vistula University
  Date: 06.12.2021
  
*/

public class TimeDemo
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      char answer = 'Y';
      String enteredTime;
      String response;

      while (Character.toUpperCase(answer) =='Y')
      {
         System.out.print("Enter a military time " +
                          "using the ##:## format: ");
         enteredTime = keyboard.nextLine();
         Time now = new Time (enteredTime);
         System.out.println("Do you want to enter " +
                            "another (Y/N)? ");
         response = keyboard.nextLine();
         answer = response.charAt(0);
      }
   }
}