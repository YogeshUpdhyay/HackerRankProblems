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

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */
    static int getgcd(int a, int b) 
    { 
    if (a == 0) 
        return b;  
    return getgcd(b % a, a);  
    } 
      
    static int getlcm(int a, int b) 
    { 
        return (a*b)/getgcd(a, b); 
    }
    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
        int lcm = 1;
        for(int i = 0;i < a.size(); i++) {
            lcm = getlcm(lcm,a.get(i));
        }
        int gcd = 0;
        for(int i =0;i < b.size(); i++) {
            gcd = getgcd(gcd,b.get(i));
        }
        return lcm/gcd;
    }

}

public class BetweenSets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result.getTotalX(arr, brr);

        System.out.println(total);

        bufferedReader.close();

    }
}
