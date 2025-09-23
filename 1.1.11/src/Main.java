import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Nhập kích thước
        System.out.println("Nhap so hang: ");
        int M = scanner.nextInt();
        System.out.println("Nhap so cot: ");
        int N = scanner.nextInt();

        boolean[][] a = new boolean[M][N];
        System.out.println("Nhap ma tran: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = scanner.nextBoolean();
            }
        }

        // In cot
        System.out.print("  ");
        for (int i = 0; i < N; i++)
            System.out.print(i + " ");
        System.out.println();

        // In hang va gia tri
        for (int i = 0; i < M; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < N; j++) {
                if (a[i][j])
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
