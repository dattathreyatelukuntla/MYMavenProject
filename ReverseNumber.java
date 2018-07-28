package com.programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your word");
		String word=sc.nextLine();
		String rev="";
for(int i=0;i<word.length();i++)
{
	rev=word.charAt(i)+rev;
}
System.out.println(rev);
	}

}
