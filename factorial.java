import java.util.*;

public class factorial {

    public static int fact(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        System.out.print("Enter a non-negative integer: ");

        int num = 5;

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int res = fact(num);
            System.out.println("Factorial of " + num + " is: " + res);
        }
    }
}