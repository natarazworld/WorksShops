package com.nt.arth;
public class Logical{
 
   public  int findBig(int x, int y) throws Exception{
	   
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   System.out.println("mysql jdbc driver is loaded");
	   
      if(x<y)
    	  return y;
      else if(x>y)
    	  return x;
      else 
    	  return 0;
    }
 
 }

