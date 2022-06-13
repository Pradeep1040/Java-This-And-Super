package org.jsp.ThisAndSuper;

public class Example1 
{
	int x;
	int y;
	
	public Example1(int a ,int b )
	{
		System.out.println(a);// without using this keyword
		System.out.println(b);
		  
		System.out.println(this.x);// with using this keyword
		System.out.println(this.y);
	}

}
