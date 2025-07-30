package BackTrack;

import java.util.ArrayList;

class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> queens = new ArrayList<>();
        placeQueen(n, 0, queens, result);
        return result;
    }

    // Helper function to place queens on the board
    public void placeQueen(int n, int col, ArrayList<Integer> queens, ArrayList<ArrayList<Integer>> result) {
        // Base case: if all queens are placed (col == n)
        if (col == n) {
            result.add(new ArrayList<>(queens));  // Add the current solution to result
            return;
        }

        // Try placing a queen in all rows of the current column (col)
        for (int row = 1; row <= n; row++) {
            if (isSafe(queens, row)) {  // Check if it's safe to place queen at (row, col)
                queens.add(row);  // Place the queen at the current row
                placeQueen(n, col + 1, queens, result);  // Move to the next column
                queens.remove(queens.size() - 1);  // Backtrack and remove the queen
            }
        }
    }

    // Helper function to check if it's safe to place the queen at (newRow, col)
    public boolean isSafe(ArrayList<Integer> queens, int newRow) {
        int newCol = queens.size();  // The current column (based on number of queens placed so far)

        // Check for any queen placed before
        for (int prevCol = 0; prevCol < queens.size(); prevCol++) {
            int prevRow = queens.get(prevCol);
            // Check if two queens are in the same row or on the same diagonal
            if (newRow == prevRow || Math.abs(prevCol - newCol) == Math.abs(prevRow - newRow)) {
                return false;
            }
        }
        return true;
    }
}

public class Nqueen {
    
}
