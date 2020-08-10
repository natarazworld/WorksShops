//SelectTest2.java
package com.nt.jdbc;  //package creation
/*  JDBC App  to get  Emp details based on given 3 desgs 
* version :: 1.0
* author ::  Team-J */
import java.util.Scanner;  //explicit pck import
import java.sql.DriverManager;
import java.sql.Connection;
import  java.sql.Statement;
import  java.sql.ResultSet;
import  java.sql.SQLException;


public class  SelectTest2
{
	public static void main(String args[]){
         Scanner sc=null;    //Local variable decl at top of  method definitation
		 String desg1=null,desg2=null,desg3=null;
		 String cond=null;
		 Connection con=null;
		 Statement st=null;
		 String query=null;
		 ResultSet rs=null;
		 boolean flag=false;
		 try{
           //read inputs
              sc=new Scanner(System.in);
			  if(sc!=null){   // To Avoid  NullPointerException
                   System.out.println("Enter desg1");
				   desg1=sc.next().toUpperCase(); //gives CLERK
				   System.out.println("Enter desg2");
				   desg2=sc.next().toUpperCase(); //gives SALESMAN
				   System.out.println("Enter desg3");
				   desg3=sc.next().toUpperCase(); //gives MANAGER
			  } //if
			  //convert input values as the required for SQL query  ('CLERK','SALESMAN','MANAGER')
              cond="('"+desg1+"','"+desg2+"','"+desg3+"')";
			  System.out.println(cond);

			  // register jdbc driver s/w
			    //Class.forName("oracle.jdbc.driver.OracleDriver");

               //establish the connection ORacle Driver s/w
               con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");

			   //create Statement object
			   if(con!=null)   //To avoid NPE
                     st=con.createStatement();
                
				//prepare SQL Query
				  //SQL> select empno,ename,job,sal from emp where job in('CLERK','SALESMAN','MANAGER') order by job desc;
                  query="SELECT EMPNO,ENAME,SAL,JOB FROM EMP WHERE JOB IN"+cond+"ORDER BY JOB DESC";
				  System.out.println(query);
                    //send and execute SQL Query in Db s/w
					if(st!=null)
                        rs=st.executeQuery(query);
					//prcoess the ResultSet object
					if(rs!=null){
                       while(rs.next()){
						   flag=true;
                           //System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(4)+"  "+rs.getFloat(3));
                 		   System.out.println(rs.getInt("EMPNO")+"  "+rs.getString("ENAME")+"  "+rs.getFloat("SAL")+"  "+rs.getString("JOB"));
						   }//while
                          if(flag)
							   System.out.println("Records displayed");
						  else
                             System.out.println("No Records found");
                        
					}//if
		 }//try
		  catch(SQLException se){  // to handle known exception
                se.printStackTrace();
		  }
		  catch(Exception e){  //To handle unknow Exceptions
                 e.printStackTrace();
		  }
		  finally{
			  //close jdbc objs
			 /* try{      ***** Bad code to close jdbc objs ******
				     if(rs!=null && st!=null && con!=null){
					    rs.close();
					    st.close();
					    con.close();
				  }//if
			  }//try
			  catch(SQLException se){
				   se.printStackTrace();
			  }*/
             //********** Good Code to close jdbc objects *****
			  try{
				  if(rs!=null)
					  rs.close();
			  }
			  catch(SQLException se){
				   se.printStackTrace();
			  }

              try{
				  if(st!=null)
					  st.close();
			  }
			  catch(SQLException se){
				   se.printStackTrace();
			  }

			   try{
				  if(con!=null)
					  con.close();
			  }
			  catch(SQLException se){
				   se.printStackTrace();
			  }

             try{
				  if(sc!=null)
					  sc.close();
			  }
			  catch(Exception e){
				   e.printStackTrace();
			  }

		  }//finally


	}//main
}//class
//cmd> javac   -d    .   SelectTest2.java
//cmd> java  com.nt.jdbc.SelectTest2