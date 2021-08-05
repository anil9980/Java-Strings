package com.anil.learning.strings;
import java.util.*;
public class Token {
public static void main(String[] args) {
	StringTokenizer st=new StringTokenizer("anil kumar is gud boy"," ");
	while(st.hasMoreTokens()==true)
	{
		System.out.println(st.nextToken());
	}
}
}
