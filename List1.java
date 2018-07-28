package com.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class List1 {
	@Test
	public void test()
	{
		List l=new ArrayList<String>();
		l.add("mahesh");
		l.add("durga");
		l.add("dattu");
		l.remove("durga");
		//System.out.println(l);
		l.add("mahesh");
		l.add("mahesh");
		System.out.println(l);
		Set s=new HashSet<Object>(l);
		System.out.println(s);
		
	}

}
