import java.util.*;

public class HelpfulMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String problem = sc.nextLine();

        String[] arr = problem.split("\\+");
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]).append("+");
        }
        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb.toString());
        
        sc.close();
    }
}
