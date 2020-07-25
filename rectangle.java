import java.io.*;
import java.util.*;


public class rectangle {


    static long largestRectangle(final int[] h) {
        final Stack<Long> height = new Stack<>();
        height.push(Long.parseLong("0"));
        for (int i = 0; i < h.length; i++) {
            int k = 0;
            int j = i;
            while(j < h.length){
                if (h[j] >= h[i]) {
                    k += 1;
                } else {
                    break;
                }
                j++;
            }
            for(int m = i-1; m >= 0;m--){
                if (h[m] >= h[i]) {
                    k += 1;
                } else {
                    break;
                }
            }
            long ht = h[i] * k;
            if (ht > height.peek()) {
                height.pop();
                height.push(ht);
            }
            
        }
        return height.peek();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) throws IOException {

        final int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        final int[] h = new int[n];

        final String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            final int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        final long result = largestRectangle(h);

        System.out.println(result);

        scanner.close();
        
    }

    
    
}