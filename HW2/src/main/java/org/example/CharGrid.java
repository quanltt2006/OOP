package org.example;

import static java.lang.Integer.min;
import static java.lang.Math.max;

public class CharGrid {
    private final char[][] grid;
    private final int rows;
    private final int cols;

    // Constructor: sao chép mảng 2D
    public CharGrid(char[][] grid) {
        this.rows = grid.length;
        this.cols = grid[0].length;
        this.grid = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            System.arraycopy(grid[i], 0, this.grid[i], 0, cols);
        }
    }

    // Tính diện tích bao quanh ký tự ch
    public int charArea(char ch) {
        int maxHang = -1;
        int minHang = rows;
        int maxCot = -1;
        int minCot = cols;
        boolean found = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == ch) {
                    found = true;
                    maxHang = max(maxHang, i);
                    minHang = min(minHang, i);
                    maxCot = max(maxCot, j);
                    minCot = min(minCot, j);
                }
            }
        }

        if (!found) {
            return 0;
        }
        return (maxHang - minHang + 1) * (maxCot - minCot + 1);
    }
    public int countPlus() {
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (isPlusCenter(i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    // Kiểm tra (i, j) có thể làm tâm chữ thập không
    private boolean isPlusCenter(int i, int j) {
        char ch = grid[i][j];
        int up = countDir(i, j, -1, 0, ch);
        int down = countDir(i, j, 1, 0, ch);
        int left = countDir(i, j, 0, -1, ch);
        int right = countDir(i, j, 0, 1, ch);

        int arm = Math.min(Math.min(up, down), Math.min(left, right));
        return arm >= 2;
    }

    // Đếm số ô liên tiếp theo một hướng (dx, dy) cùng ký tự ch
    private int countDir(int i, int j, int dx, int dy, char ch) {
        int length = 0;
        int x = i + dx;
        int y = j + dy;
        while (x >= 0 && x < rows && y >= 0 && y < cols && grid[x][y] == ch) {
            length++;
            x += dx;
            y += dy;
        }
        return length;
    }
    public static void main(String[] args) {
        char[][] arr = {
                {' ', ' ', 'p', ' ', ' '},
                {' ', ' ', 'p', ' ', 'x'},
                {'p', 'p', 'p', 'p', 'p'},
                {' ', ' ', 'p', ' ', 'x'},
                {' ', ' ', 'p', 'y', 'x'},
                {'z','z','z','z','z','y','z','z','z'},
                {' ', ' ', 'x','x',' ','y',' ',' '}
        };

        CharGrid cg = new CharGrid(arr);
        System.out.println(cg.countPlus()); // Kết quả: 2
    }
}
