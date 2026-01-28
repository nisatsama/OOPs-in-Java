package fourth;
import java.util.Scanner;

// Base Class
class Matrix {
    protected int[][] matrix;
    protected int rows;
    protected int cols;

    // Constructor
    Matrix(int rows, int cols, int[][] matrix) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = matrix;
    }

    // Method to display properties
    public void displayProperties() {
        System.out.println("Rows: " + rows);
        System.out.println("Columns: " + cols);
    }
}

// Subclass
class SquareMatrix extends Matrix {

    // Constructor
    SquareMatrix(int size, int[][] matrix) {
        super(size, size, matrix);
    }

    // Overridden method
    @Override
    public void displayProperties() {
        super.displayProperties();
        System.out.println("Trace of Matrix: " + calculateTrace());
    }

    // Method to calculate trace
    private int calculateTrace() {
        int trace = 0;
        for (int i = 0; i < rows; i++) {
            trace += matrix[i][i];
        }
        return trace;
    }

    // Method to check Identity Matrix
    public boolean isIdentityMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j && matrix[i][j] != 1)
                    return false;
                if (i != j && matrix[i][j] != 0)
                    return false;
            }
        }
        return true;
    }
}

// Main Class
public class MainMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        SquareMatrix sm = new SquareMatrix(n, arr);

        sm.displayProperties();

        if (sm.isIdentityMatrix())
            System.out.println("The matrix is an Identity Matrix.");
        else
            System.out.println("The matrix is NOT an Identity Matrix.");

        sc.close();
    }
}

