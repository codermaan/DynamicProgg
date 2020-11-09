// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class DynammicProgg {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    LCS obj = new LCS();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}// } Driver Code Ends


class LCS{
    
    // function to find LCS
    static int lcs(int p, int q, String s1, String s2){
        int L[][] = new int[p+1][q+1];
        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();
        for(int i=0; i<=p; i++){
            for(int j=0; j<=q; j++){
                if(i==0||j==0){
                    L[i][j]=0;
                }
                else if(a[i-1]==b[j-1]){
                    L[i][j]=1+L[i-1][j-1];
                }
                else{
                    L[i][j] = max(L[i][j-1],L[i-1][j]);
                }
            }
        }
        return L[p][q];
    }
    static int max(int a, int b){
        return (a>b)?a:b;
    }
}
