package nil.luis.angel.codes;

import java.util.Arrays;
import java.util.HashSet;

public class KMP {
    public static Integer II[];
    public static Integer[] computePrefixFn(String P){
        int m = P.length()-1;
        II = new Integer[m+1];
        for(int i =0;i<m+1;i++) II[i] = 0;

        II[1] = 0;
        int k = 0;
        for(int q=2; q<=m; q++){
            while(k>0 && P.charAt(k+1)!=P.charAt(q)){
                k = II[k];
            }
            if(P.charAt(k+1) == P.charAt(q))
                k = k + 1;
            II[q] = k;
        }
        return II;
    }

    public static HashSet<Integer> KMP_Matcher(String T, String P) {
        HashSet<Integer> indexesFound = new HashSet<Integer>();
        int n = T.length()-1;
        int m = P.length()-1;
        Integer[] II = computePrefixFn(P);
        int q = 0;
        for(int i =1 ; i <=n; i++){
            while(q>0 && P.charAt(q+1)!=T.charAt(i)){
                q = II[q];
            }
            if(P.charAt(q+1) == T.charAt(i))
                q = q + 1;
            if (q == m){
                System.out.println("Pattern occurs with shift "+(i-m+1));
                indexesFound.add((i-m+1));
                q = II[q];
            }
        }
        return indexesFound;
    }

    public static void main(String[] args) {
        String T = " ababaa";

        for(int i=0; i<T.length()-1;i++) {
            String P = T.substring(0,i+2);
            System.out.println(P);
            System.out.println("II:" + Arrays.toString(KMP.computePrefixFn(P)));
            KMP.KMP_Matcher(T, P);
        }
    }
}