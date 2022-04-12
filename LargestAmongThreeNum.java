package day_5;
/*
 * Author: Rajesh
 *Finding largest number among three numbers.
 */
import java.util.Scanner;

public class LargestAmongThreeNum {
	
	public static void main(String[] args) {
		
		int first, second, third = 0, largest, temp;  
		
		Scanner sc = new Scanner(System.in);  
		//reading input from the user  
		System.out.println("Enter the first number:");  
		first = sc.nextInt();  
		System.out.println("Enter the second number:");  
		second = sc.nextInt();  
		System.out.println("Enter the third number:");  
		third = sc.nextInt();  
		//comparing a and b and storing the largest number in a temp variable  
		temp=first>second?first:second;  
		//comparing the temp variable with c and storing the result in the variable  
		largest=temp>third?temp:third;
		//prints the largest number  
		System.out.println("The largest number is: "+largest);  

	}

}
