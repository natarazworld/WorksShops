package com.nt.main;

import com.nt.arth.*;
public class MainApplication {
	
	public static void main(String args[] ) throws Exception{
		Airthmetic  arth=null;
		Logical  logic=null;
		
		arth=new Airthmetic();
		logic=new Logical();
		System.out.println("sum is ::"+arth.sum(10,20));
		System.out.println("big value ::"+logic.findBig(10,20));
		
	}

}
