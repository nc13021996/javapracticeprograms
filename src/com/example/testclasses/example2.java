package com.example.testclasses;

public class example2 {
	public boolean evenOdd(int number){
		if((number %2) == 0) {
			System.out.println(" The number you have entered is "+number + " even ");
			return true;
		}else {
			System.out.println(" The number you have entered is "+ number + " odd ");
			return false;
		}		
	}
	
	public static void main(String[] args) {
		example2 s = new example2();
		System.out.println(s.evenOdd(2));
		System.out.println(s.evenOdd(5));
		
		
	}

}
