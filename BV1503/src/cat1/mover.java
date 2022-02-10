package cat1;
//Overloading
class A{
	void d1()
	{
		System.out.println("d1");
	}
	void d1(int a) {
		System.out.println(a);
	}
	void d1(int a, int b) {
		System.out.println(a+b);
	}
}
public class mover {
	public static void main(String args[]) {
		A o1 = new A();
		A o2 = new A();
		A o3 = new A();
		o1.d1();
		o2.d1(5);
		o3.d1(6,3);
	}
}
