import java.util.*;

public class Chewbacca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        long min = 0;

        String s = String.valueOf(num);
        int[] digits = s.chars().map(Character::getNumericValue).toArray();

        int[] res = new int[digits.length];

        // Handle first digit specially - don't invert if it becomes 0
        if(9 - digits[0] < digits[0] && digits[0] != 9){
            res[0] = 9 - digits[0];
        } else {
            res[0] = digits[0];
        }

        for(int i=1; i<digits.length; i++){
            if(9 - digits[i] < digits[i]){
                res[i] = 9 - digits[i];
            } else{
                res[i] = digits[i];
            }
        }
        
        for(int i=0; i<res.length; i++){
            min = min * 10 + res[i];
        }

        System.out.println(min);
        sc.close();
    }
}
