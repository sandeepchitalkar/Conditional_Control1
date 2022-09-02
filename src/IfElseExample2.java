import java.util.Scanner;

public class IfElseExample2 {
    public static void main(String args[])
    {
        int num;
        System.out.println("Enter an Integer number:");

        //The input provided by user is stored in num
        //Take input from the user  Create an instance of the Scanner class
        Scanner obj=new Scanner(System.in);
        num = obj.nextInt();

        /* If number is divisible by 2 then it's an even number else odd number*/
        if ( num % 2 == 0 )
            System.out.println("Entered number is even");
        else
            System.out.println("Entered number is odd");
    }
}
