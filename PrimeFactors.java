package day_5;
/*
 * Author: Rajesh
 *Writing a program to find prime factors off a number
 */
import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) 
    {
        System.out.println("Prime factors program");
        System.out.println("Enter a number:");
        Scanner sc =new Scanner(System.in);
       int num= sc.nextInt();
        if (num > 0)
        {
        System.out.println("Prime factors of " + num + " are :");
            for (int i = 2; i <= num; i++)
            {
                while (num % i == 0)
                {
                    System.out.println(i);

                    num = num / i;
                }
            }
        }
        else
        {
            System.out.println("Input is invalid ");

        }

    }


}
