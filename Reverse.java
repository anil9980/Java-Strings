package com.anil.learning.strings;

import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a string");
	String s1=sc.nextLine();
	System.out.println("entered string is--"+s1);
	//System.out.println("revesed string is--"+s1.reverse());
	char ch[]=s1.toCharArray();
	String s3="";
	for(int i=ch.length-1;i>=0;i--) {
		//System.out.print(ch[i]);
		 s3=s3+ch[i];
		
	}
	System.out.print(s3);
	
	
}
}
