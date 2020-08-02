package HackerRankProblems;
import java.util.*;

class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = -1;
        for(int i : keyboards) {
            for(int j : drives) {
                if(i+j <= b && max < i+j){
                    max = i+j;
                }
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] keyboards = new int[n];
        for(int i = 0;i < n;i++) {
            keyboards[i] = scanner.nextInt();
        }
        int[] drives = new int[m];
        for(int i = 0;i < m;i++) {
            drives[i] = scanner.nextInt();
        }
        
        int moneySpent = getMoneySpent(keyboards, drives, b);
        System.out.println(moneySpent);
        scanner.close();
    }
}