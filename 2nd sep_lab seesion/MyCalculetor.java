/*1… You are given a class AdvancedArithmetic which contains a method signature int
divisor_sum(int n). You need to write another class called MyCalculator which implements the
method.
*/
import java.util.*;

 class AdvancedArithmetic{
	
 void divisor_sum (int n) {
	 if(n<1000) {
		 int sum=0;
		 for(int i=1;i<=n;i++) {
			 if(n%i==0) {
				 sum=sum+i;
			 }
		 }System.out.println(sum);
	 }else {
		 System.out.println("greater");
	 }}}
 class MyCalculetor{
	 public static void main(String[]args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter int");
		 int n= sc.nextInt();
		 AdvancedArithmetic cal=new AdvancedArithmetic();
		 cal.divisor_sum(n);

	 }}
	 
		 
	  	 
	 
	
