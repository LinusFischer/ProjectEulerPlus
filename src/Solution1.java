import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextInt();
        for(long a0 = 0; a0 < t; a0++){
            long n = in.nextInt();
            long a=0, b=0, c=0;

            a = (long)Math.floor((n-1) /3);
            b = (long)Math.floor((n-1) /5);
            c = (long)Math.floor((n-1) /15);
            long sum = 3*a*(a+1)/2 + 5*b*(b+1)/2 - 15*c*(c+1)/2;
            System.out.println(sum);
        }
    }
}

