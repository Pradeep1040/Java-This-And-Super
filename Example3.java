package org.jsp.ThisAndSuper;
public class Example3 
{
	public Example3()
	{
		System.out.println("no- arg");
	}
	public Example3(int x )
	{
		this();
		System.out.println("int arg" +x);
		
	}

}