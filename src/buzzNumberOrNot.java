/*A number is said to be a buzz number when it ends with 7 or is divisible by 7.*/
import java.util.Scanner;

public class buzzNumberOrNot {
    public static void main(String[] args) {
        int num;

        // Create an object of Scanner class.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=sc.nextInt();

        if((num % 10 == 0) || (num % 7 == 0)) {
            System.out.println(num+ " is a Buzz number ");
        }
        else {
            System.out.println(num+ " is not a Buzz number");
        }
    }
}
