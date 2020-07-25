import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


class Result {

   

    public static String decryptPassword(String s) {
        // Write your code here
        char[] a = s.toCharArray();
        List<Character> result = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < a.length;i++){
            if(Character.isDigit(a[i]) & a[i] != '0'){
                stack.push(a[i]);
            }
            if(Character.isDigit(a[i]) & a[i] == '0'){
                result.add(stack.peek());
                stack.pop();
            }
            if(i < a.length -3){
                if(Character.isUpperCase(a[i]) & Character.isLowerCase(a[i+1]) & a[i+2] == '*'){
                    result.add(a[i+1]);
                    result.add(a[i]);
                    i = i+2;
                }else{
                    if(Character.isUpperCase(a[i]) | Character.isLowerCase(a[i])){
                        result.add(a[i]);
                    }
                }
            }else{
                if(Character.isUpperCase(a[i]) | Character.isLowerCase(a[i])){
                    result.add(a[i]);
                }
            }

        }
        String string = result.toString() .substring(1, 3 * result.size() - 1) .replaceAll(", ", "");
        return string;
    }

}
public class certification {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        String s = bufferedReader.readLine();

        String result = Result.decryptPassword(s);
    
        bufferedReader.close();
        
        System.out.println(result);
    }
}