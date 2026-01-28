import java.util.*;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // columns

        for (int i = 1; i <= n; i++) {

            // Odd rows → full #
            if (i % 2 == 1) {
                for (int j = 1; j <= m; j++) {
                    System.out.print("#");
                }
            }
            // Even rows
            else {
                // Row 2, 6, 10... → # at the end
                if ((i / 2) % 2 == 1) {
                    for (int j = 1; j < m; j++) {
                        System.out.print(".");
                    }
                    System.out.print("#");
                }
                // Row 4, 8, 12... → # at the start
                else {
                    System.out.print("#");
                    for (int j = 1; j < m; j++) {
                        System.out.print(".");
                    }
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
