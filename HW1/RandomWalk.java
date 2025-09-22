/******************************************************************************
 *  Compilation:  javac RandomWalk.java
 *  Execution:    java RandomWalk n
 *  Dependencies: StdDraw.java
 *
 *  % java RandomWalk 20
 *  total steps = 300
 *
 *  % java RandomWalk 50
 *  total steps = 2630
 *
 *  Simulates a 2D random walk and plots the trajectory.
 *
 *  Remarks: works best if n is a divisor of 600.
 *
 ******************************************************************************/

public class RandomWalk {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(-n - 0.5, n + 0.5);
        StdDraw.clear(StdDraw.GRAY);
        StdDraw.enableDoubleBuffering();

        int x = 0, y = 0;
        int stepsize = 1 ;
        int dir = 0;
        int steps = 0 ;
        int stepindir = 0 ;
        int changecount = 0;
        while (Math.abs(x) <= n && Math.abs(y) <= n) {
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledSquare(x, y, 0.45);
            if (dir == 0 ) x++;
            if (dir == 1 ) y++;
            if (dir == 2 ) x--;
            if (dir == 3 ) y--;

            steps++;
            stepindir++;
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledSquare(x, y, 0.45);
            StdDraw.show();
            StdDraw.pause(40);
            if (stepindir == stepsize) {
                stepindir = 0 ;
                dir = (dir+1)%4;
                changecount++;

                if (changecount % 2 == 0) {
                    stepsize++;
                }

            }



        }
        StdOut.println("Total steps = " + steps);
    }

}

