package com.nt.arth;
public class Airthmetic{
 
   public  int sum(int x, int y)throws Exception{
	   
	   Class.forName("oracle.jdbc.driver.OracleDriver");
	   System.out.println("oracle driver Loaded");
	   
      return x+y;
    }
 
 }

