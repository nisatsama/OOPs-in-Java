/*Assignment 1: The Secure Password Validator
Topic: String Class & Methods
Objective: Use built-in String methods to validate user input based on specific security rules.
•	Task: Create a program that asks a user to enter a password and checks if it is "Secure."
•	Validation Rules:
1.	Length must be at least 8 characters.
2.	Must contain at least one uppercase letter (use Character.isUpperCase()).
3.	Must contain at least one special character (e.g., @, #, $).
•	Logic: Use methods like .length(), .charAt(), and .contains().
•	Challenge: If the password is valid, print a masked version (e.g., ********) using the .repeat() or .replaceAll() method.
 */
import java.util.Scanner;

public class first {
    public static void main(String[] args) {

        String password;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a password : ");
        password = sc.nextLine();

        boolean hasUppercase = false;
        boolean hasSpecialChar = false;

        if (password.length() < 8) {
            System.out.println("Password length must be 8 characters long.");
        }

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }

            if (!Character.isLetterOrDigit(ch)) {
                hasSpecialChar = true;
            }
        }

        if (hasUppercase && hasSpecialChar) {
            System.out.println("Password is secure.");
            String maskedPassword = "*".repeat(password.length());
            System.out.println("Masked Password: " + maskedPassword);
        } else {
            System.out.println("Password is not secure.");

            if (!hasUppercase) {
                System.out.println("Password must contain at least one uppercase letter.");
            }

            if (!hasSpecialChar) {
                System.out.println("Password must contain at least one special character.");
            }
        }

        sc.close();
    }
}
