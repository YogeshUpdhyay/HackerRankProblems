import java.util.*;

public class GameOfStacks {
    static Stack<Integer> getStack(int[] a){
        Stack<Integer> stack = new Stack<>();
        for(int i : a){
            stack.push(i);
        }
        return stack;
    }
    static int twoStacks(int x, int[] a, int[] b) {
        int result = 0;
        Stack<Integer> stack_a = getStack(a);
        Stack<Integer> stack_b = getStack(b);
        int sum = 0;
        while(sum <= x){
            if(stack_a.peek() < stack_b.peek()){
                sum += stack_a.peek();
                stack_a.pop();
            }else{
                sum += stack_b.peek();
                stack_b.pop();
            }
            if(sum <= x){
                result+=1;
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] nmx = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmx[0].trim());

            int m = Integer.parseInt(nmx[1].trim());

            int x = Integer.parseInt(nmx[2].trim());

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");
            int j = 0;
            for (int aItr = n-1; aItr >= 0; aItr--) {
                int aItem = Integer.parseInt(aItems[j].trim());
                a[aItr] = aItem;
                j += 1;
            }

            int[] b = new int[m];

            String[] bItems = scanner.nextLine().split(" ");
            j = 0;
            for (int bItr = m-1; bItr >= 0; bItr--) {
                int bItem = Integer.parseInt(bItems[j].trim());
                b[bItr] = bItem;
                j++;
            }

            int result = twoStacks(x, a, b);

            System.out.println(result);
        }
    }
}