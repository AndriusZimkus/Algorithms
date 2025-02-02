import java.util.Arrays;

public class Primitives {
    public static void main(String[] args) {
        int b = 3;
        System.out.println(b);

        int N = 5;
        double[] a;
        a = new double[N];
        for (int i = 0; i < N; i++)
            a[i] = 0.0;

        System.out.println(Arrays.toString(a));

    }
}
