package day_5;
/*
 * Author: Rajesh
 *Writing a program to find that a year is Leap year or not.
 */
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("please any 4 digit year : ");
		int year =sc.nextInt();
		 if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println( +year + " year is a leap year");
	      else
	         System.out.println( + year + " year is not a leap year");
   }
		
	}
	
	

	
