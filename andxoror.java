import java.util.*;



public class andxoror {

    static LinkedList<int[]> get_all_subsets(int[] a){
        
        return null;

    }

    private static int andXorOr(int[] a) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        return 0;
    }
    
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int aCount = Integer.parseInt(scanner.nextLine().trim());

        final int[] a = new int[aCount];

        final String[] aItems = scanner.nextLine().split(" ");

        for (int aItr = 0; aItr < aCount; aItr++) {
            final int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        final int result = andXorOr(a);

        System.out.println(result);
        scanner.close();
    }

	
}