import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class DynamicArray {
    static void dynamicarray(int n, List<List<Integer>> queries) {
        List<List<Integer>> seqList = new LinkedList<>();
        int lastAns = 0;
        int temp = n;
        while(n-- > 0){
            seqList.add(new LinkedList<Integer>());
        }
        for(List<Integer> i : queries) {
            if(i.get(0) == 1) {
                seqList.get((i.get(1) ^ lastAns) % temp).add(i.get(2));
            } else {
                int index = i.get(2) % seqList.get((i.get(1) ^ lastAns) % temp).size();
                lastAns = seqList.get((i.get(1) ^ lastAns) % temp).get(index);
                System.out.println(lastAns);
            }
        }


    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int q = Integer.parseInt(temp[1]);
        List<List<Integer>> queries = new ArrayList<>();
        while(q-- > 0) {
            queries.add(Stream.of(bufferedReader.readLine().split(" ")).map(Integer::parseInt).collect(toList()));
        }
        dynamicarray(n, queries);
    }
}