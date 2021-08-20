/*Find the number of integers between 0 and N (inclusive) such that the product of digits of the integer is greater than or equal to K!, where K is the number of digits present in the integer.*/
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
// Class for faster input
static int count ;
static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 

        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 

        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 

        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 

        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 

        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 

        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
    
    static int factorial(int n){    
        if (n == 0)    
          return 1;    
        else    
          return(n * factorial(n-1));    
        }    
    
    static int loopNumbers(int n)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int pdt = 1;
    
        if(n==-1)
        {
            return 0;
        }
        else
        {
            
            loopNumbers(n-1);
            String number = String.valueOf(n);
            for(int i = 0; i < number.length(); i++) {
                
            int j = Character.digit(number.charAt(i), 10);
             list.add(j);
            }
            
            for(int i =0 ; i<list.size(); i++)
            {
                pdt*=list.get(i);
                 
                
            }
            int K = list.size();
            
            
            
            if(!(pdt >= factorial(K) && pdt > 0 && K > 0 && factorial(K) > 0))
            {
                count++;
            }
            
            
        }
        
        return count;
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    OutputStream outputStream =System.out;
        PrintWriter out =new PrintWriter(outputStream);   // use out.println("");
        FastReader sc =new FastReader();
        int t = sc.nextInt();
        if(t>=1)
        {
            
            while(t-->0)
        {
            int N = sc.nextInt();
            if(N >= 0)
            {
                out.println(((N+1)-loopNumbers(N)));
                count = 0; 
            }
          
        
        }
        out.close();
        }
		}catch(Exception e)
		{
		   System.out.println("Error is " + e);
		}
		

	}
}