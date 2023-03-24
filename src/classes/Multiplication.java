package classes;

public class Multiplication {
		   // Overloading multiplication operator for two integers
		   public int multiply(int x, int y) {
			   int multi1 = x * y;
		      return multi1;
		   }
		   
		   // Overloading multiplication operator for two doubles
		   public double multiply(double x, double y) {
			   double multi2 = x * y;
		      return multi2;
		   }
		   
		  
		   public static void main(String[] args) {
			  Multiplication myClass = new Multiplication();
			  double nikki = myClass.multiply(6, 7);
			  System.out.println(nikki);
			  int expression = myClass.multiply(3, 8);
			  System.out.println(expression);
			 System.out.println(myClass.multiply(3, 9));
			 System.out.println(myClass.multiply(2.0, 6.0));
		   }
		}

