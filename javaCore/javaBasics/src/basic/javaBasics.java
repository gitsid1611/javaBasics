package basic;

public class javaBasics {
	int x=100;
	void fun1(){
	//local variable
	int x=500;
	System.out.println("inside fun1() of Demo");
	System.out.println(this); //Demo@232323 current class obj
	System.out.println(this.x); // 100
	System.out.println(x); //500
	}
	public static void main(String[] args)
	{
		javaBasics d1=new javaBasics();
	System.out.println(d1); // Demo@232323
	d1.fun1();
	//System.out.println(this); //Compilation Error
	}

}
