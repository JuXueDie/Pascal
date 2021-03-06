import java.util.*; // 要用list()
public class Pascal {
    List<List<Integer>> rows = new ArrayList<>();
    Pascal(int height) {
        for(int r = 0; r < height; r++) {
            rows.add(createRow(r));
        }
    }
    public int combi(int r, int n) {
        return rows.get(r).get(n);
    }
    public static List<Integer> createRow(int r){
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int n = 1; n <= r; n++) {
            row.add(row.get(n - 1) * (r - n + 1) / n);
        }
        return row;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how height: "); 
        int height = sc.nextInt(); 
        Pascal p = new Pascal(height);
        for(int r = 0; r < height; r++) {
            System.out.printf(String.format("%%%ds", (height - r) * 2), "");
            for(int n = 0; n <= r; n++) {
                System.out.printf("%4d", p.combi(r, n)); // %4d = 整數為四位,不足者左邊補空白
            }
            System.out.println();
        }
    }
}
/* import static java.lang.System.out;
import java.util.*;

public class Pascal {
    private List<List<Integer>> rows = new ArrayList<>();
    
    Pascal(int height) {
        for(int r = 0; r < height; r++) {
            rows.add(createRow(r));
        }
    }
    
    int combi(int r, int n) {
        return rows.get(r).get(n);
    }
    
    private List<Integer> createRow(int r){
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int n = 1; n <= r; n++) {
            row.add(row.get(n - 1) * (r - n + 1) / n);
        }
        return row;
    }
    
    public static void main(String[] args) {
        final int HEIGHT = 12;
        Pascal p = new Pascal(HEIGHT);
        for(int r = 0; r < HEIGHT; r++) {
            out.printf(String.format("%%%ds", (HEIGHT - r) * 3), "");
            for(int n = 0; n <= r; n++) {
                out.printf("%6d", p.combi(r, n));
            }
            out.println();
        }
    }
} */