public class IfStatementExample2 {

    public static void main(String[] args) {

        byte num1 = 15;
        byte num2 = 23;

        if (num1 == num2) {
            /* nothing is printed to the console because the condition is false and the print statement never gets executed.*/
            System.out.println(num1 + " is equal to " + num2);
        }
    }
}
