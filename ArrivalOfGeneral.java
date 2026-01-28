import java.util.*;

public class ArrivalOfGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0], min = a[0];
        int posMax = 0, posMin = 0;

        // Find first max and last min
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                posMax = i;
            }
            if (a[i] <= min) {
                min = a[i];
                posMin = i;
            }
        }
        int swaps = posMax + (n - 1 - posMin);

        // If max is to the right of min, one overlap swap is saved
        if (posMax > posMin) {
            swaps--;
        }
        System.out.println(swaps);

        sc.close();
    }
}