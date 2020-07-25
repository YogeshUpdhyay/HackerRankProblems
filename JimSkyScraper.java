import java.util.*;

class JimSkyScraper {
    static int skyscraper(int[] arr) {
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            int j = i-1;
            while(j >= 0 ) {
                if(arr[j] <= arr[i]){
                    if (arr[i] == arr[j]) {
                        result += 1;
                    }   
                    j-=1;
                }else {
                    break;
                }
                
            }
            int k = i + 1;
            while(k < arr.length) {
                if(arr[k] <= arr[i]){
                    if (arr[i] == arr[k]) {
                        result += 1;
                    }  
                    k+=1;  
                }else {
                    break;
                }
                
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] hi = new int[n];
        for(int i = 0; i < n ; i++) {
            hi[i] = sc.nextInt();
        }
        int result = skyscraper(hi);
        System.out.println(result);
        sc.close();
    }
}