import java.util.*;

public class SoilderBanana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int w = sc.nextInt();

        int res = 0;

        for(int i=1; i<=w; i++){
            res += i * n;
        }
        if(res - k < 0){
            System.out.println(0);
        }else{
            System.out.println(res - k);
        }
        

        sc.close();
    }
}
