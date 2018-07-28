package com.programs;

import org.testng.annotations.Test;

public class java1 {
	String s1="mahesh";
	@Test
	public void test()
	{char c=(char) s1.length();
		for(int i=0;i<=2;i++)
		{
			 c=s1.charAt(i);
			
		}
		 System.out.print("part1:"+c);
	}

}
