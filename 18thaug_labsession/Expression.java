//Q.1 Write a Java program to find the value of specified expression.
package Operator;

public class Expression {

	public static void main(String[] args) {
		
  System.out.println((101+0)/3);
  double a =3.0e-6*10000000.1;
  System.out.println(+a);
  int b= 40;
  int c= 50;
  System.out.println(c>b && b<c); //true && true
  System.out.println(c<b && c>b); //flase && true
  System.out.println((c<b && b>c) || (c>b && b<c));
  System.out.println((c<b || b>c) && (c>b || b<c));
	
	}

}
