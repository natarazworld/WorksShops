//SelectTest1.java

 import java.sql.*; // for jdbc api
 import java.util.*; //for  Scanner

public class SelectTest1
{
	public static void main(String[] args) throws Exception
	{
		//read inputs
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start range of  student number::");
		int start=sc.nextInt();  //gives 100
		System.out.println("enter end range of  student number::");
		int end=sc.nextInt();  //gives 200

		//register  jdbc driver s/w
		 //Class.forName("oracle.jdbc.driver.OracleDriver");

		 //establish the connection
		 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
			                                                                                               "system","manager");
		 //create Statement object
		 Statement st=con.createStatement();

		 //prepare SQL query
		           //  select * from student where sno>=100 and sno<=200
          String query="select * from student where sno>="+start+" and sno<="+end;
		  System.out.println(query);

		  //send and execute SQL Query in Db s/w
		  ResultSet rs=st.executeQuery(query);
		  
		  //process the ResultSet object
		 
		  boolean flag=false;
		  while(rs.next()){
			  flag=true;
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getFloat(4));
		  }

		/*  if(!flag)  // equal to if(flag==false)
			    System.out.println("no records found");
		  else
              System.out.println("students whose sno >="+start+" and <="+end+ " details are displayed"); */

			  //ternary operator (iif->immediate if) syntax: (condition)?<true statement>: <false statment>
		   System.out.println( !flag?"records not found":"students whose sno >="+start+" and <="+end+ " details are displayed");
			  


         //close jdbc objs
		   rs.close();
		    st.close();
			con.close();

	}
}
