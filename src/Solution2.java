import java.util.*;


public class Solution2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long sum = 0;
            long i = 2;
            long lastI = 1;
            while (i<n) {
                if (i % 2 == 0) {
                    sum += i;
                }
                i += lastI;
                lastI = i - lastI;
            }
            System.out.println(sum);
        }
    }
}
