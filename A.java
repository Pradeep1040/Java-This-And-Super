package org.jsp.ThisAndSuper;

public class A 
{
	int x = 10;
	int y = 20;
	

}
class B extends A
{
	int x = 100;
	int y = 200;
	
	public B()
	{
		int x = 1;
		int y = 2; 
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(this.x);
		System.out.println(this.y);
		
		System.out.println(super.x);
		System.out.println(super.y);
	}
}
