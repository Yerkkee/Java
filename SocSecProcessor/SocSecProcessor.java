import java.util.Scanner;

public class SocSecProcessor {


    public static void main(String[] args) {
        String y = "";
        do{
            Scanner scr = new Scanner(System.in);
            System.out.println("Name?");
            String name = scr.nextLine();
            System.out.println("SSN?");
            String ssn = scr.nextLine();
            try{
                if(isValid(ssn))
                System.out.println(name+ " "+ssn+" is valid!");
            }
            catch (SocSecException e){

            }
            System.out.println("Continue?");
            y = scr.nextLine();
        }
        while (y.charAt(0)=='y'||y.charAt(0)=='Y');
        // write your code here
    }

    public static boolean isValid(String ssn) throws SocSecException
    {
        String[]numbers = ssn.split("-");
        boolean cr = false;

        if(ssn.length()==11) {
            if(ssn.charAt(3)=='-' && ssn.charAt(6)=='-') {
                for (int i=0;i<numbers.length;i++){
                    if(isNumeric(numbers[i]))cr=true;
                    else cr=false;
                }
                if(cr) return true;
                else throw new SocSecException(", contains a character that is not a digit");

            }
            throw new SocSecException(", dashes at wrong position.");
        }else {
            throw new SocSecException(", wrong number of characters");
        }
    }


    public static boolean isNumeric(String str){
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
