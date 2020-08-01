package HackerRankProblems;

import java.util.*;
import java.util.stream.IntStream;

class BonApetit {
    static void bonapetit(List<Integer> list,int k,int b) {
        int sum = list.stream().mapToInt(i -> i).sum();
        sum = sum - list.get(k);
        sum = sum/2;
        if(b - sum == 0){
            System.out.println("Bon Appetit");
        }else {
            System.out.println(b-sum);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        while(n-- > 0) {
            list.add(sc.nextInt());
        }
        int b = sc.nextInt();
        bonapetit(list,k,b);
    }
}