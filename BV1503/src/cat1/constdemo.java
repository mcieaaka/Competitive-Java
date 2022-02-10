package cat1;

import java.util.Scanner;

class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	void display() {
		System.out.println(name+" "+age);
	}
}
public class constdemo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Student[] a = new Student[n];
		for (int i=0;i<n;i++) {
			String str = sc.next();
			int age = sc.nextInt();
			a[i] = new Student(str,age);
		}
		for(int i=0;i<n;i++) {
			a[i].display();
		}
	}
}
