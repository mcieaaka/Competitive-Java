package Recursion;

public class MessageProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(message(5));
	}
	
	static String message(int t) {
		if(t==1)
			return "Hey There!";
		else
			return message(t-1);
	}

}
