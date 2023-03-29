package classes;

public class Quotient {
	public int getQuotient(int obj1, int obj2) {
	int quotient = obj1 / obj2;
	return quotient;
	}
	public static void main(String[] args) {
		Quotient exp = new Quotient();
		int quotientValue= exp.getQuotient(4, 2);
		System.out.println(quotientValue);
	}
}
