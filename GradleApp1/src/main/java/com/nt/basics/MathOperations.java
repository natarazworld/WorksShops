package com.nt.basics;

public class MathOperations {
	
	public int sum(int  x ,int y ) {
		return x+y;
	}
	
	public static void main(String[] args) {
		MathOperations operations=null;
		operations=new MathOperations();
		System.out.println("result is "+operations.sum(1000, 2000));
	}

}
