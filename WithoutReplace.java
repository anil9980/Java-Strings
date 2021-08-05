package com.anil.learning.strings;

import java.util.Scanner;

public class WithoutReplace {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter a string");
	String s1=sc.nextLine();
	System.out.println(s1);
	
	System.out.println("enter the original letter");
	String ori=sc.next();
	int ind=s1.indexOf(ori);
	System.out.println("enter the replace char");
	String s2=sc.next();
	
	String res=s1.substring(0,ind)+s2+s1.substring(ind+1);
	System.out.println(res);
	
	
	/*char ch[]=s1.toCharArray();
	System.out.println("enter the original letter");
	String ori=sc.next();
	char ch1[]=ori.toCharArray();
	System.out.println("enter the replace char");
	String s2=sc.next();
	char ch2[]=s2.toCharArray();
	
	while((ch.equals(ch1))==true) {
		
		ch=ch2;
		
	}
	
	System.out.println(ch);*/
}
}
