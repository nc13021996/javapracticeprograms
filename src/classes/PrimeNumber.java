package classes;

import java.util.Scanner;

public class PrimeNumber {
	public static boolean isPrime(int num) {
		System.out.println(num);
		int n1 = 0;
		if(num == 0) {
			System.out.println(num + " is not a prime number ");
		}else if(num == 1) {
			System.out.println(num + " is not a prime number ");
		}else {
			for(int i=2; i<num; i++) {
				if(num % i == 0) {
					n1 = 1;
					System.out.println(num + " is not a prime number ");
					break;
				}
			}
		}
		if(n1 == 0) {
			System.out.println(num + " is a prime number ");
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter a number to find out whether its a prime number or not ");
		int obj = input.nextInt();
		PrimeNumber exp = new PrimeNumber();
		exp.isPrime(obj);
		
	}	
	}
