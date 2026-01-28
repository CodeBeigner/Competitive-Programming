import java.util.*;

public class Polyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();
        map.put("Tetrahedron", 4);
        map.put("Cube", 6);
        map.put("Octahedron", 8);
        map.put("Dodecahedron", 12);
        map.put("Icosahedron", 20);

        int n = sc.nextInt();

        List<String> list = new ArrayList<>();

        while(n-- >= 0){
            String str = sc.nextLine();
            list.add(str);
        }
        int faces = 0;
        for(int i=0; i<list.size(); i++){
            if(map.containsKey(list.get(i))){
                faces += Integer.valueOf(map.get(list.get(i)));
            }
        }
        System.out.println(faces);

        sc.close();
    }
}
