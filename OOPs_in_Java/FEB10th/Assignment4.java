package FEB10th;

public class Assignment4 {

    public static void main(String[] args) {

        int[][] maze = {
                {1, 1, 0, 1},
                {1, 1, 1, 0},
                {0, 1, 1, 1},
                {0, 0, 1, 1}
        };

        boolean pathExists = MazeSolver.findPath(maze, 0, 0);

        if (pathExists)
            System.out.println("Path exists to destination!");
        else
            System.out.println("No path found.");
    }
}

class MazeSolver {

    public static boolean findPath(int[][] grid, int row, int col) {
        int n = grid.length;
        int m = grid[0].length;

      
        if (row < 0 || col < 0 || row >= n || col >= m || grid[row][col] == 0) {
            return false;
        }

      
        if (row == n - 1 && col == m - 1) {
            return true;
        }

     
        grid[row][col] = 0;

       
        return findPath(grid, row, col + 1) || findPath(grid, row + 1, col);
    }
}
