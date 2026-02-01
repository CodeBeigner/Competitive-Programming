import java.util.*;

public class SearchEasyProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();

        int n = sc.nextInt();
        while(n-- > 0){
            int EasyOrHard = sc.nextInt();
            arr.add(EasyOrHard);
        }
        boolean foundHard = false;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == 1){
                foundHard = true;
                break;
            }
        }
        
        if(foundHard){
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
        sc.close();
    }
}

// Optimal - You don't need to store all the values—just check them as you read:

// public class SearchEasyProb {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         int n = sc.nextInt();
//         boolean foundHard = false;
        
//         for(int i = 0; i < n; i++){
//             if(sc.nextInt() == 1){
//                 foundHard = true;
//                 break;
//             }
//         }
        
//         System.out.println(foundHard ? "HARD" : "EASY");
//         sc.close();
//     }
// }