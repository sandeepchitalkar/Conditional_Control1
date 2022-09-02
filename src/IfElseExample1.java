/*Write an if-then statement that prints High value item! when itemCost is greater than 24.00*/

import java.util.Scanner;
public class IfElseExample1 {
    public static void main(String args[]){
        int itemCost;
        //Take input from the user  Create an instance of the Scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        itemCost=sc.nextInt();
        if( itemCost > 24.00 ){
            System.out.println("High value item!");
        }
        else {
            System.out.println("Not an High value item!");
        }
    }

}
