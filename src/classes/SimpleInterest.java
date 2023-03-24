package classes;
import java.util.Scanner;

public class SimpleInterest {
   public static void main(String args[]) {
      double principal, rate, time, interest;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the principal amount: ");
      principal = input.nextDouble();

      System.out.print("Enter the interest rate: ");
      rate = input.nextDouble();

      System.out.print("Enter the time period in years: ");
      time = input.nextDouble();
      
      System.out.println(" my name ");
     String name = input.next();
     
     System.out.println(" enter the value ");
     int number = input.nextInt();
     
     System.out.println(" enter float value ");
     float value = input.nextFloat();
     
     System.out.println(" true or false ");
     boolean expression = input.nextBoolean();
     
     System.out.println(" long value ");
     long value3 = input.nextLong();
     
     System.out.println(" short value ");
     short value1 = input.nextShort() ;
     
     System.out.println(" double value ");
     double value2 = input.nextDouble();
     
     System.out.println(" char ");
     char character = input.next().charAt(0);
     
     System.out.println(" byte ");
     byte nikhila = input.nextByte();
     
     interest = (principal * rate * time) / 100;

      System.out.println("Simple Interest = " + interest);
   }
}
