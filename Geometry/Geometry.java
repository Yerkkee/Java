import java.util.Scanner;

/**
   This program demonstrates static methods
*/

public class Geometry
{
   public static void main(String[] args)
   {
      int choice;       // The user's choice
      double value = 0; // The method's return value
      char letter;      // The user's Y or N decision
      double radius;    // The radius of the circle
      double length;    // The length of the rectangle
      double width;     // The width of the rectangle
      double height;    // The height of the triangle
      double base;      // The base of the triangle
      double side1;     // The first side of the triangle
      double side2;     // The second side of the triangle
      double side3;     // The third side of the triangle

      // Create a scanner object to read from the keyboard
      Scanner keyboard = new Scanner(System.in);

      // The do loop allows the menu to be displayed first
      do
      {
         // TASK #1 Call the printMenu method
         printMenu();
         choice = keyboard.nextInt();

         switch(choice)
         {
            case 1:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circleArea method and
               // store the result in the value variable
               value=circleArea(radius);

               System.out.println("The area of the " +
                                  "circle is "+value);
               break;
            case 2:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the rectangleArea method and
               // store the result in the value variable
               value=rectangleArea(length,width);

               System.out.println("The area of the " +
                                  "rectangle is " + value);
               break;
            case 3:
               System.out.print("Enter the height of " +
                                "the triangle: ");
               height = keyboard.nextDouble();
               System.out.print("Enter the base of " +
                                "the triangle: ");
               base = keyboard.nextDouble();

               // TASK #3 Call the triangleArea method and
               // store the result in the value variable
               value=triangleArea(height,base);

               System.out.println("The area of the " +
                                  "triangle is " + value);
               break;
            case 4:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circumference method and
               // store the result in the value variable
               value=circleCircumference(radius);

               System.out.println("The circumference " +
                                  "of the circle is "+
                                  value);
               break;
            case 5:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and
               // store the result in the value variable
               value=rectanglePerimeter(length,width);

               System.out.println("The perimeter of " +
                                  "the rectangle is "+
                                  value);
               break;
            case 6:
               System.out.print("Enter the length of " +
                                "side 1 of the " +
                                "triangle: ");
               side1 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 2 of the " +
                                "triangle: ");
               side2 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 3 of the " +
                                "triangle: ");
               side3 = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and
               // store the result in the value variable
               value=trianglePerimeter(side1,side2,side3);
               System.out.println("The perimeter of " +
                                  "the triangle is "+
                                  value);
               break;
            default:
               System.out.println("You did not enter " +
                                  "a valid choice.");
         }
         keyboard.nextLine(); // Consume the new line

         System.out.println("Do you want to exit " +
                            "the program (Y/N)?: ");
         String answer = keyboard.nextLine();
         letter = answer.charAt(0);

      } while(letter != 'Y' && letter != 'y');
   }

   // TASK #1 Create the printMenu method here
   public static void printMenu(){
      System.out.println("This is a geometry calculator");
      System.out.println("Choose what you would like to calculate");
      System.out.println("1. Find the area of a circle");
      System.out.println("2. Find the area of a rectangle");
      System.out.println("3. Find the area of a triangle");
      System.out.println("4. Find the circumference of a circle");
      System.out.println("5. Find the perimeter of a rectangle");
      System.out.println("6. Find the perimeter of a triangle");
      System.out.println("Enter the number of your choice:");
   }
   // TASK #2 Create the value-returning methods here
   /**
    The circleArea method returns the area of circle.
    @param r The radius of circle.
    @return The area of circle is pi multiply by power of radius.
    */
   public static double circleArea(double r){
      double a = Math.PI*Math.pow(r,2);// Assign the value of num1 + num2 to a.
      return a;
   }
   /**
    The rectangleArea method returns the area of rectangle.
    @param l The length of rectangle.
    @param w The weight of rectangle.
    @return The area of rectangle is length multiply by weight.
    */
   public static double rectangleArea(double l,double w){
      double a = l*w;
      return a;
   }
   /**
    The triangleArea method returns the area of triangle.
    @param h The height of triangle.
    @param b The base of triangle.
    @return The area of triangle is height multiplied base divide by two.
    */
   public static double triangleArea(double h,double b){
      double a = (h*b)/2;
      return a;
   }
   /**
    The circleCircumference method returns the circumference of circle.
    @param r The radius of circle.
    @return The circumference is equal to the radius times 2 times PI.
    */
   public static double circleCircumference(double r){
      double a = 2*Math.PI*r;
      return a;
   }
   /**
    The rectanglePerimeter method returns the perimeter of rectangle.
    @param l The height of rectangle.
    @param w The weight of rectangle.
    @return The perimeter of the rectangle is two times the height and the weight added times two.
    */
   public static double rectanglePerimeter(double l,double w){
      double a = (2*l)+(2*w);
      return a;
   }
   /**
    The trianglePerimeter method returns the perimeter of triangle.
    @param s1 The side of triangle.
    @param s2 The second side of triangle.
    @param s3 The third side of triangle.
    @return The perimeter of a triangle is equal to the sum of all sides.
    */
   public static double trianglePerimeter(double s1,double s2,double s3){
      double a = s1+s2+s3;
      return a;
   }
   // TASK #4 Write javadoc comments for each method

}