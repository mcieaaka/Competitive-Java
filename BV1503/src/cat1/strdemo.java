package cat1;

public class strdemo {
	public static void main(String args[]) {
		String s1 = new String();
		s1="afafaf";
		char ch[] = {'a','b','c'};
		String s2 = new String(ch);
		char ch2[] = {'a','b','c','d'};
		String s3 = new String(ch2,0,2); //(char array, start index, num of char)
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
