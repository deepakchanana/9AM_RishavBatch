package pkg1;

public class Student 
{  // boundary of the class

	 int a; // variable
	 public void deepak()  // () indicate this is a method
	 {   // boundary of the method
		 System.out.println("Welcome to all of you"); 
	 }
	 
	 public static void main(String[] args)
	 {
		Student abc=new Student();
		abc.deepak();
		abc.a=23;
		System.out.println(abc.a);
		abc.a=455;
		System.out.println(abc.a);
	 }
	
}
