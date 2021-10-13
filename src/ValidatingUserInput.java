import java.util.Scanner;
import java.util.InputMismatchException;
public class ValidatingUserInput {
    public static int readInt(String msg) {
        boolean error=false;
        int x=0;
        do {
            try {
                Scanner KB=new Scanner(System.in);
                System.out.print("Enter integer : ");
                x=KB.nextInt();
                error=false;
            }
            catch(InputMismatchException e) {
                System.out.println("Invalid Input..Pls Input Integer Only..");
                error=true;
            }
        }
        while(error);
        return(x);
    }
}
