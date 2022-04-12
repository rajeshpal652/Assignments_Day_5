package day_5;

import java.util.Scanner;
/*
 * Author: Rajesh
 *Writing a program to calculate power of 2 and finding that number is Leap Year or Not. 
 */
public class powerOfTwo {
	public static int power(int a , int b ) {
		
		int X=(int) Math.pow(a,b);
		
		return X;
		}
	public static void main(String[] args) {
		
		int result=0;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a Number between 1 to 30 : ");
		int uservalue=sc.nextInt();
		for(int i=1;i<=uservalue;i++) {
		if(uservalue<31)
         {
			 result=power(2, i);
             System.out.println(2 + " " +" to power of " +i+ "=" + result);
         }
	}
		 if (((result % 4 == 0) && (result % 100 != 0)) || (result%400 == 0)) {
	         System.out.println(result + "year is a leap year");
		 }
	         
	      else {
	         System.out.println(result + " year is not a leap year");
	      }
	   }

}
