package feb17th;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[3];

        try {
            System.out.print("Enter index (0-2): ");
            int index = sc.nextInt();

            System.out.print("Enter value: ");
            int value = sc.nextInt();

            arr[index] = value;  

            System.out.println("Value inserted successfully!");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Error: Invalid index entered!");
        }

      
        try {
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println(" Checked Exception caught: Class not found!");
        }

        sc.close();
    }
}

