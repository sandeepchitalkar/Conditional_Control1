import java.util.Scanner;

public class number_division {
    public static void main(String[] args) {

        int num1, num2;

        // Create an object of Scanner class.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        num1=sc.nextInt();

        System.out.println("Enter the divisor:");
        num2 = sc.nextInt();

        if(num1 % num2 == 0) {
            System.out.println(num1+ " is divisible by " +num2);
        }
        else {
            System.out.println(num1+ " is not divisible by " +num2);
        }
    }
}
