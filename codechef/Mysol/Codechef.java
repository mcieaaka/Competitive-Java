/* package codechef; // don't place package name! */
//Sahil's Ques....My Sol
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int nodig(int n)
    {
        if(n!=0){
            int nc=0;
            while(n!=0)
            {
                nc++;
                n=n/10;
            }
            return nc;
        }else{
            return 1;
        }
    }
    static int digProd(int n)
    {
        if(n!=0)
        {
            int p=1;
            while(n!=0)
            {
                int t=n%10;
                p=p*t;
                n=n/10;
            }
            return p;
        }
        else
        {
            return 0;
        }
    }
    static int fact(int n)
    {
        int pr=1;
        if(n!=0)
        {
            for(int i=1;i<=n;i++)
            {
                pr = pr*i;
            }
            return pr;
        }
        else
        {
            return 1;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    ArrayList<Integer> ans = new ArrayList<Integer>();
	    for(int i=0;i<T;i++)
	    {
	        int nb = sc.nextInt();
	        int c=0;
	        for(int j=0;j<=nb;j++)
	        {
	            if(digProd(j)>=fact(nodig(j)))
	            {
	                c++;
	            }
	        }
	        ans.add(c);
	    }
	    Iterator<Integer> it = ans.iterator();
	    while(it.hasNext()) {
            System.out.println(it.next());
        }
	}
}
