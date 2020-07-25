import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;
public class DiagonalDiffernce {
    static int diagonalDifference(List<List<Integer>> arr) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0;i < arr.size();i++) {
            for(int j = 0;j < arr.size();j++){
                if(i==j){
                    sum1+=arr.get(i).get(j);
                }
                if(j == (arr.size()-1) - i){
                    sum2+=arr.get(i).get(j);
                }
            }
        }
        return Math.abs(sum1-sum2);
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = diagonalDifference(arr);
        System.out.println(result);
    }
}