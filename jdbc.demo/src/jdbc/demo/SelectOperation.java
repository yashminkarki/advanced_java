package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectOperation {
	//Select operation using just Statement interface
	
	static String url = "jdbc:mysql://localhost:3306/firstpracticedb";
	static String username = "root";
	static String password = "Nickynick77$";
	static Connection conn = null;
	

	public static void main(String[] args) {
		try {
			// Register or Load the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 // Creating connection
			conn = DriverManager.getConnection(url, username, password);//if we write here Connection conn then itwill be a local variable
			
			 if (conn != null) {
				System.out.println("Connected");
				
				// creating statement
				
				Statement st = conn.createStatement(); //note-no parameter
				String sql = "select * from practiceusers where id=3";
			
				
				// execute query
				ResultSet rs=st.executeQuery(sql);
				 while(rs.next()){	     
				        
				     //System.out.println(rs.getString("user_id") + "   " + rs.getString("Email") );
					 System.out.println(rs.getString("id") + "   " + rs.getString("last_name"));
					
				      }				
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		// closing connection
		finally {
			try {
			
				conn.close();
				
			} catch (SQLException e) {
				//e.printStackTrace();
				System.out.println("problem in closing connection");
			}

		}
		

	}

}
