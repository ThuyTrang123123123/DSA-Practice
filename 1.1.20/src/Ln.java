public class Ln{
    public static double Ln(double N) {
        if (N <= 1)
            return 0.0;
        return Math.log(N) + Ln(N - 1);
    }
}
