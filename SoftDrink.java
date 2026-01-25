import java.util.*;

public class SoftDrink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n -> friends, k.l -> drink ml, -> c.d -> lemon slices
        int n = sc.nextInt(), k=sc.nextInt(), l=sc.nextInt(), c=sc.nextInt(), d=sc.nextInt(), p=sc.nextInt(), nl=sc.nextInt(), np = sc.nextInt();

        double maxDrinkMl = k * l;
        double lemonSlices = c * d;
        double toast_on_salt = p / np;

        double drinkPerTost = maxDrinkMl / nl;

        double res = Math.min(
        Math.min(
            Math.floor((double) drinkPerTost / n),
            Math.floor(lemonSlices/n)), 
            Math.floor(toast_on_salt/n));
        
        System.out.println((int) res);
        sc.close();
    }
}
