package classes;
// method overloading is a part of polymorphism
public class Example1 {
	public int mul(int a, int b) {
		int mul = a * b;
		System.out.println(" This print statement is for int ");
		return mul;
	}
	public float mul(float a,  float b) {
		float mul = a * b;
		System.out.println(" This print statement is for float ");
		return mul;
	}
	public long mul(long a, long b) {
		long mul = a * b;
		System.out.println(" This print statement is for long ");
		return mul;
	}
	public int mul(int a, int b , int c, int d) {
		int mul = a * b * c * d;
		System.out.println(" This print statement is for int with four arguments ");
		return mul;
	}
	

}
