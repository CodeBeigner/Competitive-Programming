import java.util.*;

public class TramCapacity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stops = sc.nextInt();
        int curCap = 0;
        int min = 0;

        while(stops-- > 0){
            int exit = sc.nextInt();
            int enter = sc.nextInt();

            curCap += enter - exit; 

            min = Math.max(min, curCap);
        }
        System.out.println(min);
        
        sc.close();
    }
}