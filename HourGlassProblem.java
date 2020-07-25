import java.util.*;
import java.io.*;



public class HourGlassProblem{

    static int sumofglass(int i, int j, int[][] arr){
        int sum = 0;
        int m = i;
        for(int k = j; k < j+3;k++){
            sum += arr[m][k];
        }
        sum = sum+arr[i+1][j+1];
        m = i+2;
        for(int k = j;k < j+3;k++){
            sum += arr[m][k];
        }
        return sum;
    }

    static int hourglassSum(int[][] arr){
        int[] results = new int[16];
        int k = 0;
        for(int i = 0;i < 4;i++){
            for(int j = 0;j < 4;j++){
                int sum = sumofglass(i , j ,arr);
                results[k] = sum;
                k++;
            }
        }
        Arrays.sort(results);
        return results[15];
    }


    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException{

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        scanner.close();
        int result = hourglassSum(arr);

        System.out.println(result);
        
    }
}