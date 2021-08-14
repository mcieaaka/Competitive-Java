// { Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}// } Driver Code Ends


class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    if(n>=3){
    	    int first = a[0];
            for (int i = 1;i < n ; i++)
                if (a[i] > first)
                    first = a[i];
         
            // Find second
            // largest element
            int second = Integer.MIN_VALUE;
            for (int i = 0;i < n ; i++)
                if (a[i] > second &&a[i] < first)
                    second = a[i];
         
            // Find third
            // largest element
            int third = Integer.MIN_VALUE;
            for (int i = 0;i < n ; i++)
                if (a[i] > third && a[i] < second)
                    third = a[i];
            
            return third;
        }else{
            return -1;
        }
        
    }
}
