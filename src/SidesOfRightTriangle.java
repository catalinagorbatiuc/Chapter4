import java.util.Scanner;

public class SidesOfRightTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int a = sc.nextInt();
        System.out.print("Enter second side: ");
        int b = sc.nextInt();
        System.out.print("Enter third side: ");
        int c = sc.nextInt();
        if(isTriangle(a, b, c))
            System.out.printf("The triangle is%sright angled.\n",
                    isRightAngled(a, b, c) ? " " : " NOT ");
        else
            System.out.println("The entered values could NOT be a triangle.");
    }
    private static boolean isTriangle(int a, int b, int c){
        return ((a + b > c) && (a * c > b) && (b + c > a));
    }
    private static boolean isRightAngled(int a, int b, int c){
        int hypotenuse;
        if(a > b && a > c)
            hypotenuse = a;
        else if(b > a && b > c)
            hypotenuse = b;
        else
            hypotenuse = c;
        return (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(hypotenuse, 2));
    }
}