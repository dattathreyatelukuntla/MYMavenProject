package com.programs;
class A1
{
	private static String name;
	public  void setname(String name)
	{
		this.name=name;
	}
	public static String getname()
	{
		return name;
		
	}
	
}



public class GetterMethods {
	
	
	public static void main(String[] args) {
	A1 a1=new A1();
	a1.setname("durga");
	System.out.println(a1.getname());
}
}

