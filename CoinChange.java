package HackerRankProblems;
import java.util.*;

class CoinChange {
    
    
    static long change(int[] coins,int s) {
        long[][] ways = new long[coins.length+1][s+1];
        ways[0][0] = 1;
        for(int i = 1;i <= coins.length;i++) {
            for(int j = 0;j <= s;j++) {
                if(coins[i-1] > j) {
                    ways[i][j] = ways[i-1][j];
                }else {
                    ways[i][j] = ways[i-1][j]+ways[i][j-coins[i-1]];
                }
            }
        }
        return ways[coins.length-1][s-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] coins = new int[n];
        for(int i = 0;i < n;i++) {
            coins[i] = sc.nextInt();
        }
        sc.close();
        int[][] arr = new int[coins.length+1][s+1];

        long result = change(coins,s);
        System.out.println(result);
    }
}