package com.programs;
class parent
{
	int a=33;
	public parent() {
		System.out.println(a);
	}
}
class child extends parent
{
	int a=55;
	public child() {
		
		System.out.println(super.a);
	}
}
public class JavaQuestion2 {

	public static void main(String[] args) {
		
child c=new child();
	}

}
