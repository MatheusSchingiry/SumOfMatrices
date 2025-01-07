import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int X, Y;
        int [][] m1, m2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("*******************************");
        System.out.println("*       Sum of Matrices       *");
        System.out.println("*******************************\n");

        System.out.print("Write the X(-) length of matrices: ");
        X = scanner.nextInt();
        System.out.print("Write the Y(|) length of matrices: ");
        Y = scanner.nextInt();

        m1 = new int[Y][X];
        m2 = new int[Y][X];

        for(int i = 0; i < m1.length; i++) {
            for(int j = 0; j < m1[i].length; j++){
                System.out.print("Write the value of the matrices 1 positon " +(i+1)+ " - " +(j+1)+ ": ");
                m1[i][j] = scanner.nextInt();
                System.out.print("Write the value of the matrices 2 positon " +(i+1)+ " - " +(j+1)+ ": ");
                m2[i][j] = scanner.nextInt();
                System.out.println();
            }
        }

        sum(m1, m2);
    }

    public static void sum(int[][] m1, int[][] m2){
        int[][] result = new int[m1[0].length][m1.length];
        int sum;
        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[i].length; j++){
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }

        System.out.println("Result: ");
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[i].length; j++){
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }
    }
}