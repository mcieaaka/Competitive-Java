// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();
			
            Solution ob = new Solution();
            int ans  = ob.trailingZeroes(N);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int fact(int n){
        if (n!=0)
        {
            return n*fact(n-1);
        }else{
            return 1;
        }
    }
    static int ZerC(int n)
    {
        String s = Integer.toString(n);
        return s.length();
    }
    static int trail(int n)
    {
        if(n!=0)
        {
            if(n%10==0)
                return trail(n/10)+1;
            else 
                return 0;
        }
        else
        {
            return ZerC(n);
        }
    }
    static int trailingZeroes(int N){
        // Write your code here
        int f = fact(N);
        return trail(f);
    }
}