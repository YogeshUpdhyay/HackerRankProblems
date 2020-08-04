package HackerRankProblems;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class PickingNumbers {

    static int pickingNumbers(List<Integer> a) {
        // Write your code here
        Collections.sort(a);
        int count = 0;
        int max = 0;
        for(int i = 0;i < a.size()-1;i++) {
            if(Math.abs(a.get(i + 1) - a.get(i)) <= 1) {
                count += 1;
            }else{
                if(count > max) {
                    max = count;
                } 
                count = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = pickingNumbers(a);
        System.out.println(result);
        bufferedReader.close();

    }
}