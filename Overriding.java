package com.programs;
class Test_A
{int a=10,b=25,c;
	public void add()
	{
		c=a+b;
		System.out.println(c);
	}
}
class Test_B extends Test_A

{ int d=56;
	
	@Override
	public void add() {
		c=a+b+d;
		System.out.println(c);
	}
	
}
public class Overriding {

	public static void main(String[] args) {
		
Test_B b=new Test_B();
b.add();
Test_A a=new Test_B();
a.add();
	}

}
