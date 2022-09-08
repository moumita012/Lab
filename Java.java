//Q.3... Develop a public java class and make sure nobody can create
//any object of this class from outside the class


public class Java {
	
 int id;
 String name;

 static String company="XYZ";
 Java (int id,  String name){
	 this.id=id;
	 this.name=name;
}
 void display() {
	 System.out.println(id+" "+name+" "+company);
	 
 }
 	static class Java1{ 
	 public static void main(String[] args) {
		 
		 Java s1=new Java (10,"Anita");
		 Java s2=new  Java (11,"Moumita");
				 s1.display();
				 s2.display();
	 }}}
	

