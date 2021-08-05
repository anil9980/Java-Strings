package com.anil.learning.strings;

import java.util.Scanner;

public class ReplaceAll {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter an string");
	String s1=sc.nextLine();
	System.out.println("enter original string and replace string");
	String s2=sc.nextLine();
	String s3=sc.nextLine();
	System.out.println(s1.replaceAll(s2, s3));
}
}
