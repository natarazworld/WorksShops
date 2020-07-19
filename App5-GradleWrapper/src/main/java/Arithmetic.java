package com.nt.basics;
public class Arithmetic
 {
	 public  int sum(int a,int b){
                 return a+b;
	 }
	public static void main(String[] args) 
	{
		System.out.println("Welcome Gradel---> Java");
		Arithmetic ar=new Arithmetic();
		System.out.println("Result is ::"+ar.sum(100,321));
	}
}
