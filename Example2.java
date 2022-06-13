package org.jsp.ThisAndSuper;

public class Example2 
{
	// Call argument constrctor of current class
	
	public Example2()
	{
		System.out.println("No arg");
	}
	public Example2(int x )
	{
		this();
		System.out.println(x);
	}
	public Example2(char ch, String s) 
	{
		this(100);
		System.out.println(ch);
		System.out.println(s);
	}
	

}

class MainofClass
{
	public static void main(String[] args) 
	{
		new Example2('x',"Hello");
		
	}
}
