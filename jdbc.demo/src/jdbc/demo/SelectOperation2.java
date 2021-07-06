package jdbc.demo;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectOperation2 {
	
	//insert operation using prepared statement interface
	static String url = "jdbc:mysql://localhost:3306/firstpracticedb";
	static String username = "root";
	static String password = "Nickynick77$";
	static Connection conn = null;
	

	public static void main(String[] args) {
		
		try {
			//Register or load the Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Creating connection
			conn = DriverManager.getConnection(url, username, password);
			if(conn != null) {
				System.out.println("Connected");
				//Creating statement
				
				PreparedStatement ps = conn.prepareStatement("select * from practiceusers where id=?");
				ps.setInt(1, 3);
				
				//execute query
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getString(1) + " " + rs.getString(2));
					
					
				}
				
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		finally {
			try {
				conn.close();
			}
			catch(SQLException e) {
				//e.printStack();
				System.out.println("problem in closing connection");
						
			}
		}
	
	}

}
