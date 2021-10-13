import java.util.Scanner;

public class PalindromesTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      Palindromes np = new Palindromes();

        while(true){
            System.out.print("Enter a 5 digit number to test: ");
            int testCase = sc.nextInt();

            if(np.validate(testCase)){
                if(np.isPalindrome(testCase))
                    System.out.printf("%s is a palindrone.\n", testCase);
                else
                    System.out.printf("%s is not a palindrone.\n", testCase);
                break;
            }
        }
    }
}