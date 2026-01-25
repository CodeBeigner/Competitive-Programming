import java.util.*;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[5][5];
        
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int idx1 = 0;
        int idx2 = 0;

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(matrix[i][j] == 1){
                    idx1 = i;
                    idx2 = j;
                }
            }
        }
        int count = Math.abs(idx1 - 2) + Math.abs(idx2 - 2);
        
        System.out.println(count);

        sc.close();
    }
}
