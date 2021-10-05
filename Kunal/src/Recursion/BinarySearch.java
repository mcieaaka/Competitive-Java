package Recursion;

public class BinarySearch {
	public static void main(String args[]) {
		int[] a = {1,2,3,4,5};
		System.out.println(binsearch(a,3,0,4));		
	}
	
	static int binsearch(int[] arr,int target, int start, int end) {
		if(start>end)
			return -1;
		int mid = start + (end-start)/2;
		
		if(arr[mid]==target)
			return mid;
		if(arr[mid]>target)
			return binsearch(arr,target,start,mid-1);
		return binsearch(arr,target,mid+1,end);	
	}
}
