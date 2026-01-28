/*Assignment 1: Matrix Operation Overloading
Topic: Method Overloading
Objective: Create a class MatrixMath that can perform addition on different scales. This tests how you handle varying parameter types while keeping the method name consistent.
•	Task: Implement two versions of a method named add():
1.	Scalar Addition: add(int[][] matrix, int scalar) – Adds a single integer value to every element in the matrix.
2.	Matrix Addition: add(int[][] matrixA, int[][] matrixB) – Adds two matrices of the same dimensions together.
•	Logic: Use nested for loops to traverse the 2D arrays. Ensure the second method checks if the dimensions of matrixA and matrixB match before adding.
*/
package fourth;

import java.util.Scanner;

class MatrixMath {

    // 1. Scalar Addition
    public int[][] add(int[][] matrix, int scalar) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j] + scalar;
            }
        }
        return result;
    }

    // 2. Matrix Addition
    public int[][] add(int[][] matrixA, int[][] matrixB) {

        if (matrixA.length != matrixB.length ||
            matrixA[0].length != matrixB[0].length) {

            System.out.println("Matrix dimensions do not match!");
            return null;
        }

        int rows = matrixA.length;
        int cols = matrixA[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    // Method to print matrix
    public static void printMatrix(int[][] matrix) {
        if (matrix == null) return;

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MatrixMath mm = new MatrixMath();

        // Input matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];

        // Input Matrix A
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        // Input Matrix B
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        // Scalar value input
        System.out.print("Enter scalar value: ");
        int scalar = sc.nextInt();

        // Scalar Addition
        System.out.println("\nResult of Scalar Addition:");
        int[][] scalarResult = mm.add(matrixA, scalar);
        printMatrix(scalarResult);

        // Matrix Addition
        System.out.println("\nResult of Matrix Addition:");
        int[][] matrixResult = mm.add(matrixA, matrixB);
        printMatrix(matrixResult);

        sc.close();
    }
}
