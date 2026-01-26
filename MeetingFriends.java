import java.util.*;

public class MeetingFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt(), x2 = sc.nextInt(), x3 = sc.nextInt();

        int dist = Math.max(Math.max(Math.abs(x1-x2), Math.abs(x2-x3)), Math.abs(x1-x3));

        System.out.println(dist);

        sc.close();
    }
}
