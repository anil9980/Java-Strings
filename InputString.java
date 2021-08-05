package com.anil.learning.strings;

import java.util.Scanner;

public class InputString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String s1=sc.nextLine();
	System.out.println("enter the replace letter with original letter");
    String s2=sc.next();
    String s3=sc.next();
    
	System.out.println(s1.replace(s2, s3));
	System.out.println(s1.replaceAll(s2, s3));
}
}
