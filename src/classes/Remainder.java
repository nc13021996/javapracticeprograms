package classes;

import java.util.Scanner;

public class Remainder {
	public int getRemainder(int number, int divider) {
		System.out.println(" Number = " + number );
		System.out.println("Divider = " + divider);
	int	remainder = number % divider;
	return remainder;
		
	}
	
	
	public static void main(String[] args) {
	Remainder exp = new Remainder();
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter the number to be divided ");
	int number = sc.nextInt();
	System.out.println(" Enter the divider ");
	int divider = sc.nextInt();
	// exp.getRemainder(number, divider);
	int remainder = exp.getRemainder(number, divider);
	System.out.println(" The remainder is: " + remainder);
	}

}
