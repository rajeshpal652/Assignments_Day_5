package day_5;
/*
 * Author: Rajesh
 *Printing a harmonic value of a number.
 */
import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String arg[])
	{
	double num,i;
	double sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	num=sc.nextDouble();
	System.out.print("Harmonic number is : ");
	for( i=1; i<=num; i++)
	{
		System.out.print("1/" +i +"+");
		sum=sum+(1/i);
	}
	System.out.println("");
	System.out.println("Harmonic value = "+sum);
	}

}
