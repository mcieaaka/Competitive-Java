package Recursion;

public class NumbersExample {
	public static void main(String args[])
	{
		printer(1);
	}
	
	static void printer(int n) {
		if(n==5) {
			System.out.println(5);
			return;
		}		
		System.out.println(n);
		printer(n+1);
	}
}
