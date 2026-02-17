package feb17th;
import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator {

    public void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result = " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            calc.divide(a, b);
        }

        catch (InputMismatchException e) {
            System.out.println("Error: Please enter only numbers!");
        }

        catch (Exception e) {
            System.out.println("Unexpected error occurred.");
        }

        sc.close();
    }
}

