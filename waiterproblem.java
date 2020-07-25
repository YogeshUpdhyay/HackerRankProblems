
import java.util.*;



public class waiterproblem {



    static int MAX_SIZE = 1200;
    static LinkedList<Integer> primes = new LinkedList<Integer>(); 

    static void createprimes()  
    {
        boolean [] IsPrime = new boolean[MAX_SIZE];  
          
        for(int i = 0; i < MAX_SIZE; i++) 
            IsPrime[i] = true; 
          
        for (int p = 2; p * p < MAX_SIZE; p++)  
        {  
            if (IsPrime[p] == true)  
            {  
                for (int i = p * p; i < MAX_SIZE; i += p)  
                    IsPrime[i] = false;  
            }  
        }  
        for (int p = 2; p < MAX_SIZE; p++)  
        if (IsPrime[p] == true)  
                primes.add(p); 
    } 



    static int[] getag(int i,int[] ag){
        int p = primes.get(i);
        LinkedList<Integer> tag = new LinkedList<>();
        for(int j = ag.length-1;j >= 0; j--){
            if(ag[j]%p !=0){
                tag.add(ag[j]);
            }
        }
        int[] nag = new int[tag.size()];
        for(int k = 0;k < tag.size();k++){
            nag[k] = tag.get(k);
        }
        return nag;
    }



    static LinkedList<Integer> getbi(int i, int[] ag){
        int p = primes.get(i);
        LinkedList<Integer> tbi = new LinkedList<>();
        for(int j = ag.length-1;j >= 0; j--){
            if(ag[j]%p == 0){
                tbi.add(ag[j]);
            }
        }
        return tbi;

    }


    static int[] waiter(int[] number, int q) {
        LinkedList<Integer> result  = new LinkedList<>();
        int[] ag = number;
        int i = 0;
        while(i < q && ag.length!=0){
            LinkedList<Integer> bi= getbi(i,ag);
            ag = getag(i,ag);
            Collections.reverse(bi);
            result.addAll(bi);
            i++;
        }
        int w = ag.length-1;
        while( w >= 0 ){
            result.add(ag[w]);
            w--;
        }
        int[] array = result.stream().mapToInt((Integer p) -> p.intValue() ).toArray();
        return array;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a0 = new int[n];
        for(int i = 0;i < n;i++){
            a0[i] = sc.nextInt();
        }
        sc.close();
        createprimes();
        int[] result = waiter(a0, q);
        for(int i:result){
            System.out.println(i);
        }
    }
}