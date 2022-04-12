package day_5;
/*
 * Author: Rajesh
 *Program to Swap two numbers
 */
import java.util.Scanner;

public class SwapTwoNumber {
	public static void main(String[] args) {
		
		  int first, second, temp;// x and y are to swap   
	      Scanner sc = new Scanner(System.in);  
	      System.out.println("Enter the value of First Number :");  
	      first = sc.nextInt();
	      System.out.println("Enter the value of Second Number :");
	      second = sc.nextInt();  
	      System.out.println("before swapping numbers: "+first +" & "+ second);  
	      //swapping
	       
	      temp = first;  
	      first = second;  
	      second = temp;  
	      System.out.println("After swapping: "+first +" & " + second);  
	      System.out.println( );  
	    }

}
