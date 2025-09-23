public class Main {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 2};
        int M = 3;
        int[] h = histogram.histogram(a, M);

        for (int i = 0; i < h.length; i++) {
            System.out.println(i + " xuat hien " + h[i] + " lan");
        }
    }
}