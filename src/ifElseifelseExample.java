/* WAP to read a number from user and let us know how many digit number is that*/

import java.util.Scanner;

public class ifElseifelseExample {
    public static void main(String[] args) {
        int num;

        //Take input from the user  Create an instance of the Scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=sc.nextInt();

        //Logical And Operator is used to check range for digit
        if(num>=1 && num <100) {
            System.out.println("Its a two digit number");
        }
        else if(num>=100 && num <1000) {
            System.out.println("Its a three digit number");
        }
        else if(num>=1000 && num <10000) {
            System.out.println("Its a four digit number");
        }
        else if(num>=10000 && num <100000 ) {
            System.out.println("Its a five digit number");
        }
        else {
            System.out.println("number is not between 1 & 99999");
        }
    }
}
