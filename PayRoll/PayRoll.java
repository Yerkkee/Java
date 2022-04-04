/*-------------------------
Name: Yerkebulan Zhaiylkan
Student id: 55903
Java Final exam
Date: 19.01.2022
 --------------------------*/

public class PayRoll {

    public final int NUM_EMPLOYEES = 7;

    private int[] employeeId = { 5658845, 4520125, 7895122, 8777541,
            8451277, 1302850, 7580489 };
    private int[] hours =
            new int[NUM_EMPLOYEES];
    private double[] payRate =
            new double[NUM_EMPLOYEES];
    private double[] wages =
            new double[NUM_EMPLOYEES];

    //get & set Employee ID
    public int getEmployeeId(int i) {return employeeId[i];}
    public void setEmployeeId(int[] id) {employeeId = id;}

    //get & set Employee hours
    public int getHours(int i) {return hours[i];}
    public void setHours(int index, int h) {hours[index] = h;}

    //get & set Employee Pay rate
    public double getPayRate(int i) {return payRate[i];}
    public void setPayRate(int index, double p) {payRate[index] = p;}

    //get & set Employee wages
    public double getWages(int i) {return wages[i];}
    public void setWages(int index) {wages[index] = hours[index] * payRate[index];}

    public double getGross(int id) {
        int index = 0;
        boolean validId = false;
        double gross = 0;
        for (int i = 0; i < NUM_EMPLOYEES; i++)
        {
            if (id == employeeId[i])
            {
                index = i;
                validId = true;
                break;
            }
        }
        if (validId) gross = hours[index] * payRate[index];

        return gross;
    }
}
