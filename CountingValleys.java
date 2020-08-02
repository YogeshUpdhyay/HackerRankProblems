package HackerRankProblems;

import java.util.*;

class CountingValleys {
    static int countingValleys(int n, String s) {
        char[] arr = s.toCharArray();
        int valleys = 0;
        int alti = 0;
        for(int i = 0;i < n;i++) {
            if(arr[i] == 'U') {
                alti += 1;
            }else {
                alti -= 1;
            }
            if(alti == 0 && arr[i] == 'U'){
                valleys += 1;
            }
        }
        return valleys;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = sc.nextLine();
        int result = countingValleys(n,s);
        System.out.println(result);
        sc.close();
    }
}