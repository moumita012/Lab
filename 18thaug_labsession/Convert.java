//Q.2 Write a Java program to convert minutes into a number of years and days.

package Operator;

public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The total number of min"+3456789);
		int year= 3456789/ 525600;
		int days= (3456789/60/24)%365;
		System.out.println( +days+"days");
		System.out.println( +year+"Year");
	}

}
