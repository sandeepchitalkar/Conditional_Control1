import java.util.Scanner;

public class ifElseifExample {
    public static void main(String[] args)
    {
        int number;
        System.out.println("Enter an Integer number:");
        //Take input from the user  Create an instance of the Scanner class
        Scanner input=new Scanner(System.in);
        number = input.nextInt();
        if(number > 0)
        {
            System.out.println(number+" is a positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }
    }
}
