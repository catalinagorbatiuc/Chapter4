import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to compute its factorial: ");
        int f = sc.nextInt();
        System.out.printf("The factorial of %d = %d\n", f, getFactorial(f));
        System.out.print("Enter the number of times to calculate e: ");
        int n = sc.nextInt();
        System.out.printf("e = %.2f\n", getConstantE(n));
        System.out.print("Enter the number of times to calculate e^x: ");
        n = sc.nextInt();
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.printf("e^%d %d times = %.2f\n", n, n, getValueE(n, x));
    }
    private static int getFactorial(int x){
        int factorial = x;
        if(x > 1)
            x--;
        while(x > 0){
            factorial *= x;
            x--;
        }
        return factorial;
    }
    private static double getConstantE(int x){
        double e = 1.0;
        for(int i=1; i<=x; i++){
            e += 1.0/getFactorial(i);
        }
        return e;
    }
    private static double getValueE(int n, int x){
        double e = 1.0;
        for(int i=1; i<=n; i++){
            e += x/getFactorial(i);
            x = (int)Math.pow(x, i);
        }
        return e;
    }
}