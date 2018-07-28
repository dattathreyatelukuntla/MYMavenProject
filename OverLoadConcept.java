package com.programs;
class A
{
	public static  void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
}
public class OverLoadConcept {

	public static void main(String[] args) {
A.add(23, 56);
A.add(123, 345,2345);
A.add('s', 't');

	}

}
