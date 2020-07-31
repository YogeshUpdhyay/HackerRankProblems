package HackerRankProblems;

import java.util.*;

class Kangaroo {
    
    static String getResult(int x1,int v1,int x2,int v2) {
        int rpos = x1-x2;
        int rspeed = v1-v2;
        String result = "NO";
        if(rpos > 0 && rspeed >= 0 || rpos < 0 && rspeed <= 0) {
            return "NO";
        }
        if(rpos == 0) {
            return "YES";
        }
        if(Math.abs(rpos) % Math.abs(rspeed) == 0){
            result = "YES";
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();
        sc.close();
        String result = getResult(x1,v1,x2,v2);
        System.out.println(result);
    }
}