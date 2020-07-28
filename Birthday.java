package HackerRankProblems;

import java.util.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Birthday {
    static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        for(int i = 0;i < s.size();i++) {
            int sum = 0;
            int j = i;
            while(j <= m+i && j < s.size()) {
                sum += s.get(j);
                j+=1;
                if(sum >= d) {
                    break;
                }
            }
            if(j-i == m && sum == d) {
                count +=1;
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday(s, d, m);

        System.out.println(result);


        bufferedReader.close();

    }

    
}