package pkg1;
// its like a method
// constructor name and class name will be same
// no return type
// no need to call it will be called as we create the object of the class

public class Class22
{
	public void m1()
	{
		System.out.println("method 1");
	}
	public void m2()
	{
		this.m1(); // calling method1
		System.out.println("method 2");
		this.m3(11,22);  // calling method3
	}
	public void m3(int a,int b)
	{
		System.out.println("method 3");
	}
	public static void main(String[] args) 
	{
	 Class22 obj=new Class22();
	 obj.m2();  // calling m2 
	}

}
