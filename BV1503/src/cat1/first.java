package cat1;

import java.util.*;//Importing a package

//Package->Classes-> Compile and Run
public class first {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);//Classname object = new Class()
		int a = sc.nextInt();
		String str = sc.next();
		float f = sc.nextFloat();
		char ch = sc.next().charAt(0);
		System.out.println("----------------");
		System.out.println(a);
		System.out.println(str);
		System.out.println(f);
		System.out.println(ch);
	} 
}

/**
 * class harshit{}
 * public class harshit{}
 * private
 * protected
 * **/
