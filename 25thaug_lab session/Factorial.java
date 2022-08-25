// to find factorial of any no


import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		int fact=1, no, i;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		no = sc.nextInt();
		for(i=1; i<=no; i++) {
		fact = fact*i;
		
		}System.out.println("Factorial is"+fact);
	}}