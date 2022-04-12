package day_5;
/*
 * Author: Rajesh
 *Checking if a number is odd or even
 */
import java.util.Scanner;

public class CheckOddEven {
	
	public static String  Checkevenodd(int Number) {
		String Checkevenodd ="";
		 if(Number % 2 ==0) {
			Checkevenodd= Number+ " is Even Number";	
		    }
		 else {
		    Checkevenodd=  Number+ " is Odd Number ";
		    }
		 return Checkevenodd;
	}
	public static void main(String[] args) {
		System.out.print("Enter any number : ");
		Scanner sc =new Scanner(System.in);
		int Number= sc.nextInt();
    
		String CheckEvenOdd = Checkevenodd(Number);

		System.out.println(CheckEvenOdd);
    }

}
