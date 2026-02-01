import java.util.*;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user = sc.next();
        Set<Character> set = new HashSet<>();

        for(int i=0; i<user.length(); i++){
            set.add(user.charAt(i));
        }
        if(set.size() % 2 != 0){
            System.out.println("IGNORE HIM!");
        }else{
            System.out.println("CHAT WITH HER!");
        }

        sc.close();
    }
}