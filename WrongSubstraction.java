import java.util.*;

public class WrongSubstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        while(k-- > 0){
            int rem = n % 10;
            if(rem != 0){
                n -= 1;
            }else{
                n /= 10;
            }
        }
        System.out.println(n);

        sc.close();
    }
}
