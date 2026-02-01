import java.util.*;

public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int[] friends = new int[n+1];

        for(int i=1; i<=n; i++){
            int friend_who_gave_gift_to_i = sc.nextInt();
            friends[friend_who_gave_gift_to_i] = i;
        }
        for(int i=1; i<=n; i++){
            System.out.println(friends[i]);
        }

        sc.close();
    }
}

// Can be optimized using a BufferReader