package Inheritance;

class A {
	public A() {
		super();
	}
	int a = 5;
}

class B extends A {
	public B() {
		super();
	}
	int b = 10;
	
	public String whatMethod() {
		return "I am in a method in Class B";
	}
	// String concatination
	public String addNumber(int a, int b) {
		int mul = a * b;
		String myString = " The product of the given two numebers is = " + mul;
		return myString;
	}
	
}

class C  {
	int c = 15;

	public  void printc(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}
	public int returnInteger(int a, int b, int c , int d) {
		int mul = a * b * c * d;
		return mul;
		
	}
}

public class Inheritance {
	// super method
	
	public static void main(String args[]) {
		C c = new C(); 
		A a = new A();
		B b = new B();
		System.out.println("Printing value of C " + c.c);
		System.out.println("Printing value of A " + a.a);
		System.out.println("Printing value of B " + b.b);
	    c.printc(12, 16);
	    System.out.println("*******************");
	    c.printc(b.a, b.b);
	    System.out.println(b.whatMethod());
	    String val = b.whatMethod();
	    System.out.println(val);
	    System.out.println(c.returnInteger(2, 6, 9, 4));
	    int f = c.returnInteger(2, 6, 9, 4);
	    System.out.println(f);
	    String str = b.addNumber(5, 5);
	    System.out.println(str);
	}
}
