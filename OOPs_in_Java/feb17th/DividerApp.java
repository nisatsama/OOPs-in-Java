package feb17th;

import java.util.Scanner;

public class DividerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        try {
            int result = a / b;
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
            System.out.println("Please try again with a non-zero number.");
        }
        finally {
            System.out.println("Calculation Attempt Finished.");
        }

        sc.close();
    }
}

