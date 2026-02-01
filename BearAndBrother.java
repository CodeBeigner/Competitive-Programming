import java.util.*;

public class BearAndBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int small = sc.nextInt();
        int big = sc.nextInt();

        int year = 0;

        while(big >= small){
            small = 3 * small;
            big = 2*big;

            year++;
        }
        System.out.println(year);

        sc.close();
    }
}
