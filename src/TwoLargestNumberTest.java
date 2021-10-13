import java.util.Scanner;

public class TwoLargestNumberTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TwoLargestNumber tl = new TwoLargestNumber();

        for(int i=0; i<10; i++){
            System.out.printf("%d/10. Enter number: ", i+1);
            tl.enterNumber(sc.nextInt());
        }

        System.out.printf("First Largest: %d\nSecond Largest: %d\n",
                tl.getFirstLargest(), tl.getSecondLargest());
    }
}