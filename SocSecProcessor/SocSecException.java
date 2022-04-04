import java.util.Scanner;

public class SocSecException extends Throwable {
    SocSecException(String error){
        String error2 = "Invalid social security number";
        System.out.println(error2+error);
    }
}
