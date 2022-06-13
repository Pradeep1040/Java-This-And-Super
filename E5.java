package org.jsp.ThisAndSuper;

public class E5 
{
	public E5()
	{
		System.out.println("Hello E5");
	}
	
}
 class E2 extends E5
 {
	 public E2(int x)
	 {
		 super();
		 System.out.println("Hello B"+x);
	 }
 }
 class C extends E2
 {
	 public C(boolean a)
	 {
		 super(100);
		 System.out.println("Hello C"+a);
	 }
 }
 
 
