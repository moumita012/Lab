//Q.3 Write a Java program that accepts two integers from the user

package Operator;
import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("The first integer=");
	    int a = obj.nextInt();
		System.out.println("The second integer=");
	    int b = obj.nextInt();
		int c=a+b;
		System.out.println("Sum="+c );
		int d = a-b;
		System.out.println("Difference="+d );
		int e = a*b;
		System.out.println("Multiplication="+e );
	    float f= a/b;
		System.out.println("Division="+f );
	     float g = (a+b)/2;
		System.out.println("Average="+g );
		int h= a-b;
		System.out.println("Distance="+h );
		int max= Math.max(a,b);
		System.out.println("maximum="+max );
		int min =Math.min(a, b);
		System.out.println("inimum="+min );
		
		
		
		
		
	}

}
