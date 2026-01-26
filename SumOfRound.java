import java.util.*;

public class SumOfRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();   // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> roundNums = new ArrayList<>();

            int place = 1;
            while (n > 0) {
                int digit = n % 10;
                if (digit != 0) {
                    roundNums.add(digit * place);
                }
                n /= 10;
                place *= 10;
            }

            System.out.println(roundNums.size());
            for (int x : roundNums) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
