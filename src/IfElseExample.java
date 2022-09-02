import java.util.Scanner;

public class IfElseExample {
    public static void main(String args[]){
        int num;
        //Take input from the user  Create an instance of the Scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=sc.nextInt();
        if( num < 50 ){
            System.out.println("num is less than 50");
        }
        else {
            System.out.println("num is greater than or equal 50");
        }
    }
}
