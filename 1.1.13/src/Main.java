import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước
        System.out.print("Nhap so hang M: ");
        int M = scanner.nextInt();
        System.out.print("Nhap so cot N: ");
        int N = scanner.nextInt();

        int[][] a = new int[M][N];
        System.out.println("Nhap ma tran:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma tran chuyen vi:");
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < M; i++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
