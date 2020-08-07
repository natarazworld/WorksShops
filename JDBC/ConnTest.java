//ConnTest.java
import java.sql.*;  //jdbc api

public class  ConnTest
{
	public static void main(String args[])throws Exception{
      // register oracle thin driver  with DriverManager service
	        /*  // create jdbc driver class object
			        oracle.jdbc.driver.OracleDriver driver=new oracle.jdbc.driver.OracleDriver();
             //register jdbc driver
			         DriverManager.registerDriver(driver); */

					 //Load jdbc driver class to register jdbc driver s/w with  DriverManager service
 					      Class.forName("oracle.jdbc.driver.OracleDriver"); // Best technique
						 //oracle.jdbc.driver.OracleDriver driver=new oracle.jdbc.driver.OracleDriver();
						  // new oracle.jdbc.driver.OracleDriver();

        //establish the connection with DB s/w
		     //Connection con=DriverManager.getConnection("<url> ","<dbuser>","<dbpwd>");
			  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
				                                                                                              "system",
				                                                                                              "manager");
			  System.out.println("jdbc con obj class name::"+con.getClass());
			  //check the connection
			   if(con==null)
				      System.out.println("connection is not established");
			   else
				   System.out.println("Connection is established");
				    
	}//main
}//class
//cmd>javac  ConnTest.java
//cmc>java  ConnTest