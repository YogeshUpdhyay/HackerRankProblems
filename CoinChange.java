package HackerRankProblems;
import java.util.*;

class CoinChange {
    
    static long change(List<Long> coins,int s) {
        Arrays.fill(ways,-1);
        ways[0][0] = 1;
        for(int i = 0;i < n+1;i++) {
            for(int j = 0;j <= s;s++) {
                if(coins.get(i) > j) {
                    ways[i][j] = ways[i-1][j];
                }else {
                    ways[i][j] = ways[i-1][j] + ways[i][j];
                }

            }
        }
        return ways[n][s];
    }
    public static int  s,n;
    public static long[][] ways = new long[n+1][s+1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        n = sc.nextInt();
        LinkedList<Long> coins = new LinkedList<>();
        for(int i = 0;i < n;i++) {
            long temp = sc.nextLong();
            coins.add(temp);
        }
        sc.close();

        long result = change(coins,s);
        System.out.println(result);
    }
}