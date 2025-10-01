package org.example;

public class TetrisGrid {
    private final int rows;
    private final int cols;
    private final boolean[][] grid;

    public TetrisGrid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.grid = new boolean[rows][cols];
    }

    public boolean[][] getGrid() {
        return grid;
    }

    private boolean isRowFull(int i) {
        for (int j = 0; j < cols; j++) {
            if (!grid[i][j]) {
                return false;
            }
        }
        return true;
    }

    public void clearRows() {
        int currentRow = 0;
        for (int i = 0; i < rows; i++) {
            if (!isRowFull(i)) {
                for (int j = 0; j < cols; j++) {
                    grid[currentRow][j] = grid[i][j];
                }
                currentRow++;
            }
        }

        for (int i = currentRow; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = false;
            }
        }
    }

    public static void main(String[] args) {

    }
}
