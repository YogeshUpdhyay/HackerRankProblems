import java.util.*;
import java.util.stream.IntStream;
public class EqualStacks {
    static Stack<Integer> getStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i : arr) {
            stack.add(i);
        }
        return stack;
    }
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        int sum1 = IntStream.of(h1).sum();
        int sum3 = IntStream.of(h3).sum();
        int sum2 = IntStream.of(h2).sum();
        //Stack<Integer> stack1 = getStack(h1);
        //Stack<Integer> stack2 = getStack(h2);
        //Stack<Integer> stack3 = getStack(h3);
        if(sum1 == sum2 && sum2 == sum3) {
            return sum1;
        }
        return sum1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] n1N2N3 = scanner.nextLine().split(" ");

        int n1 = Integer.parseInt(n1N2N3[0].trim());

        int n2 = Integer.parseInt(n1N2N3[1].trim());

        int n3 = Integer.parseInt(n1N2N3[2].trim());

        int[] h1 = new int[n1];

        String[] h1Items = scanner.nextLine().split(" ");

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
            h1[h1Itr] = h1Item;
        }

        int[] h2 = new int[n2];

        String[] h2Items = scanner.nextLine().split(" ");

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
            h2[h2Itr] = h2Item;
        }

        int[] h3 = new int[n3];

        String[] h3Items = scanner.nextLine().split(" ");

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
            h3[h3Itr] = h3Item;
        }

        int result = equalStacks(h1, h2, h3);
        System.out.println(result);
    }
}