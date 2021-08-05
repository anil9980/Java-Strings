package com.anil.learning.strings;

import java.util.Scanner;

public class Spaces {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String str=sc.nextLine();
	char ch1[]=str.toCharArray();
	char ch2[]=new char[ch1.length];
	int j=ch1.length-1;
	for(int i=0;i<=ch1.length-1;i++) {
		if(ch1[i]==' ') {
			ch2[i]=' ';
			
			}
		
	}
	for(int i=0;i<=ch1.length-1;i++) {
		if(ch1[i]  != ' ') {
			 if(ch2[j]==' ') {
				j--;
			 }
			 ch2[j]=ch1[i];
			 j--;
			}
			
	}
	 str=new String(ch2);
	System.out.println(str);
}
}
