import java.util.*;




public class queueusingstacks {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> stack = new LinkedList<Integer>();
        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
            int q  = sc.nextInt();
            if(q == 1){
                int element = sc.nextInt();
                stack.add(element);
            }
            if(q==2){
                stack.remove();
            }
            if(q ==3){
                int k = stack.peek();
                System.out.println(k);
            }

        }
        sc.close(); 
        
    }
  
}
