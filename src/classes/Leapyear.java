package classes;

public class Leapyear {
	public boolean leapYear(int year){
		if((year % 4 == 0) && year%100!= 0 || (year%400 == 0)) {
			System.out.println("Is a leap year" + year);
			return true;
		}else { 
			System.out.println(" Is not a leap year " + year);
			return false;
		}
		
	}
	public static void main(String[] args) {
		Leapyear n = new Leapyear();
		boolean nikhila = n.leapYear(1996);
		System.out.println(nikhila);
		System.out.println(n.leapYear(2023));
		System.out.println(n.leapYear(2022));
		System.out.println(n.leapYear(2024));
	}
	
}


