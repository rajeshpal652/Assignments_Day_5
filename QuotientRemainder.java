package day_5;
/*
 * Author: Rajesh
 *Program to find Quotient and Reminder of a number
 */
import java.util.Scanner;

public class QuotientRemainder {
	
	public static int  Quotient(int dividend,int divisor) {
		int quotient = dividend / divisor;
		return quotient;
	}
	public static int  Remainder(int dividend,int divisor) { 
	    int remainder = dividend % divisor;
	    return remainder;
	}



	public static void main(String[] args) {
		System.out.println("Enter dividend number: ");
       
       Scanner sc =new Scanner(System.in);
       int dividend=  sc.nextInt();
       System.out.println("Enter divisior number: ");
       Scanner scanner =new Scanner(System.in);
       int divisor= scanner.nextInt();
		 

	    int quotient = Quotient(dividend, divisor);
	    int remainder = Remainder(dividend, divisor);

	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);

	}

}
