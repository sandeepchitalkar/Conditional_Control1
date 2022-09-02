import java.util.Scanner;

/*age of user as input and find whether he is a child, adult, or senior on the basis of age.
Using Java if-else-if ladder statements.
 */
public class AgeofUser {
 public static void main(String[] args) {
  int age;
  // Create an object of Scanner class to take the input.
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter your age:");
  age = sc.nextInt();

  if (age < 18)
   System.out.print("Child");
  else if ((age >= 18) && (age <= 60))
   System.out.print("Adult");
  else if (age <= 60)
   System.out.print("Senior");
  else
   System.out.print("Invalid age");
 }
}
