import java.util.*;


public class leftrotation {


    static int[] leftshift(int[] a, int d){
        int shift = d % a.length;
        int[] temp = Arrays.copyOfRange(a, 0, shift);
        int[] result = new int[a.length];
        int j = 0;
        for(int i = d;i < a.length;i++){
            result[j] = a[i];
            j+=1;
        }
        for(int i = 0;i < temp.length;i++){
            result[j] = temp[i];
            j++;
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        scanner.close();

        int[] result = leftshift(a , d);

        for(int i:result){
            System.out.println(i);
        }
    }
}