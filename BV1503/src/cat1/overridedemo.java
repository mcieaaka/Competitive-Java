package cat1;
interface example{
	void ex1();
}
class C{
	int n=5;
//	void display() {
//		System.out.println(n);
//	}
}
class B extends C{

	void display() {
		System.out.println(n*n);
	}
}
public class overridedemo {
//	static int a = 5;
	static void sq(int a) {
		System.out.println(a*a);
	}
	public static void main(String args[]) {
		int a = 3;
		sq(a);
		B obj = new B();
		obj.display();
	}
}
