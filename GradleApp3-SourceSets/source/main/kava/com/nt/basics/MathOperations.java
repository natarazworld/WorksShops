package com.nt.basics;

import java.util.Scanner;

public class MathOperations {
	
	public int sum(int  x ,int y ) {
		return x+y;
	}
	
	public static void main(String[] args) {
		MathOperations operations=null;
		Scanner sc=null;
		
		operations=new MathOperations();
		System.out.println("result is "+operations.sum(1000, 2000));
		//read inputs
		sc=new Scanner(System.in);
		System.out.println("Enter mame::");
		String name=sc.next();
		System.out.println("name::"+name);
		
		
		
	}

}
