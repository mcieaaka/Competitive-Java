package cat1;
class Teacher{
	int d;
	String name;
	Teacher(){
		d=1;
		name="adga";
	}
	Teacher(int d, String name){
		this.d =d;
		this.name = name;
	}
	void display() {
		System.out.println(d+" "+name);
	}
}
public class second {
	public static void main(String args[]) {
		Teacher t1 = new Teacher();
		Teacher t2 = new Teacher(2,"asfasf");
		t1.display();
		t2.display();
	}
}

