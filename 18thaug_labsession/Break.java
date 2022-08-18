//Q.4 Write a Java program to break an integer into a sequence of individual digits.

package Operator;

public class Break {

	public static void main(String[] args) {
	int a= 6723;
	int b= (a/1000)%10;
	int c=(a/100)%10;
	int d=(a/10)%10;
	int e =(a%10);
		System.out.println("output="+b +" " +c +" " +d +" "+e);	

	}

}
