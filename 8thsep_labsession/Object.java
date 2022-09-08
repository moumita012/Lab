/*Q.3…. Can you create object of a class from inside the scope of
another class constructor.*/
/*Yes, it is possible*/


             class Obj{
	 Obj(){
		 System.out.println("hi");
	 }}
	public class Object {

	public static void main(String[] args) {
		Obj sc= new Obj();
	}}


 