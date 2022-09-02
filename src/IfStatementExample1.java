import java.util.Scanner;

public class IfStatementExample1 {
    public static void main(String args[]){
        int num;
        //Take input from the user  Create an instance of the Scanner class
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number=");
        num= obj.nextInt();
        if( num < 100 ){
            // following println statement will only execute, if the above condition is true
            System.out.println("number is less than 100");
        }
    }
}
