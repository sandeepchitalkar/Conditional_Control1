import java.util.Scanner;

/*Let’s create a program where we will take marks as input of
five subjects and calculate the total marks, percentage, and grade.*/
public class ifElseExample3 {
    public static void main(String[] args)
    {
        int phyMarks,chemMarks, mathsMarks, engMarks, compMarks;
        float totalMarks, myPer;
        // Create an object of Scanner class to take input.
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the marks of Physics ");
        phyMarks = sc.nextInt();
        System.out.println("Enter the marks of Chemistry ");
        chemMarks = sc.nextInt();
        System.out.println("Enter the marks of Maths ");
        mathsMarks = sc.nextInt();
        System.out.println("Enter the marks of English ");
        engMarks = sc.nextInt();
        System.out.println("Enter the marks of Computer ");
        compMarks = sc.nextInt();

        //Calculate the total marks obtain in 5 subjects
        totalMarks = phyMarks + chemMarks + mathsMarks + engMarks + compMarks;
        System.out.println("Total marks in five subjects: " +totalMarks);

        //Calculate the average marks or percentage
        myPer = totalMarks /5;

        System.out.println("My percentage: " +myPer);

        if(myPer >= 80) { // Checking percentage to find grade using if else statement.
            System.out.println("Grade A");
        }
        else {
            System.out.println("Grade B");
        }
    }
}
