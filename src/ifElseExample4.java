/* there is an isFilled value, that represents whether the order is ready to ship.

    Write an if-then-else statement that:
    When isFilled is true, print Shipping.
    When isFilled is false, print Order not ready.*/

public class ifElseExample4 {
    public static void main(String[] args) {

        boolean isFilled = false;

        if(isFilled==true)
        {
            System.out.println("Shipping");
        }
        else
        {

            System.out.println("Order not ready");
        }

    }
}
