package edu.coursera.parallel;
import java.util.Arrays;
import static edu.rice.pcdp.PCDP.async;
import static edu.rice.pcdp.PCDP.finish;

public final class AsyncSum {
    private AsyncSum() {
    }
    public static int calculate(final int val,final int val1) {
        final int[] arr = new int[6];
        int n = arr.length;
        int[] a = Arrays.copyOfRange(arr, 0, (n + 1) / 2);
        int[] b = Arrays.copyOfRange(arr, (n + 1) / 2, n);
        finish(() -> {
            async(() -> {
                int sum_a = Arrays.stream(a).sum();
                sum_a=val;
            });
            int sum_b = Arrays.stream(b).sum();
            sum_b=val1;
        });
        return val+val1;
    }
}
