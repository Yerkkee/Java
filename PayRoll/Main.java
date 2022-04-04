import java.text.DecimalFormat;
import java.util.Scanner;

/*-------------------------
Name: Yerkebulan Zhaiylkan
Student id: 55903
Java Final exam
Date: 19.01.2022
 --------------------------*/

public class Main {

    public static void main(String[] args) {
        int hours;
        double pay;

        Scanner keyboard = new Scanner(System.in);
        PayRoll payroll = new PayRoll();

        for (int index = 0; index < 7; index++)
        {
            System.out.print("Enter the hours worked by employee id-" +
                    payroll.getEmployeeId(index) + ": ");
            hours = keyboard.nextInt();
            while (hours < 0)
            {
                System.out.print("Enter 0 or more hours: ");
                hours = keyboard.nextInt();
            }
            payroll.setHours(index, hours);
            System.out.print("Enter the hourly pay rate for employee id-" +
                    payroll.getEmployeeId(index) + ": ");
            pay = keyboard.nextDouble();
            while (pay < 6)
            {
                System.out.print("Enter 6.00 or greater for pay rate: ");
                pay = keyboard.nextDouble();
            }
            payroll.setPayRate(index, pay);
            payroll.setWages(index);
        }

        keyboard.close();

        System.out.println();
        System.out.println("PAYROLL DATA:");
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        for (int index = 0; index < 7; index++)
        {
            System.out.println("Employee ID: " + payroll.getEmployeeId(index));
            System.out.println("Gross Pay:   $" + dollar.format(payroll.getGross(payroll.getEmployeeId(index))));
            System.out.println();
        }
    }

}