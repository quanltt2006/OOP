import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] a = new int[n][n];
        for (int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                a[i][j] = i*n + j ;
            }
        }
        System.out.println("Before");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
        for (int i = 0 ; i < n ; i++) {
            for(int j = i+1 ; j < n ; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        System.out.println();
        System.out.println("After");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }

    }


}
