package com.anil.learning.strings;

public class StringToChar {
public static void main(String[] args) {
	String s1="anil kumar";
	char ch[]=s1.toCharArray();
	for(int i=0;i<=ch.length-1;i++) {
		System.out.println(ch[i]);
	}	
	char cha[]= {'a','n','i','l'};
	String s2=new String(cha);
	System.out.println(cha);
	
	
}
}
