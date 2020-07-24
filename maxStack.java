import java.util.*;
public class maxStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        Stack<Integer> mst = new Stack<>();
        int max = 0;
        while(n-- > 0) {
            int q = sc.nextInt();
            if(q == 1){
                int t = sc.nextInt();
                try {
                    if(t > mst.peek()){
                        max = t;
                    }else{
                        max = mst.peek();
                    }
                    mst.push(max);
                } catch (Exception e) {
                    mst.push(t);
                }
                st.push(t);
            }else if(q == 2) {
                st.pop();
                mst.pop();
            }else {
                System.out.println(mst.peek());
            }            
        }
        sc.close();
    }
}