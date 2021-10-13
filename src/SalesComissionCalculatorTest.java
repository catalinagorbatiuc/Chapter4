import java.util.Scanner;

public class SalesComissionCalculatorTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SalesComissionCalculator salesCal = new SalesComissionCalculator();

        int item = 0;

        while(item != 9){
            System.out.print("Enter the number(1-4) of the item sold (9 to exit): ");
            item = sc.nextInt();

            salesCal.enterItem(item);
        }

        if(salesCal.getSalesTotal() > 0){
            System.out.print("\nWEEKLY COMMISSION\n");
            System.out.printf("Weekly sales total: %.2f\n", salesCal.getSalesTotal());
            System.out.printf("Weekly earnings: %.2f\n", salesCal.calculateCommission());

        }
    }
}