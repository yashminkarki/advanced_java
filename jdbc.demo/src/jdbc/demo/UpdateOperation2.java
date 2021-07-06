package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateOperation2 {
	//update operation using Statement interface

	static String url = "jdbc:mysql://localhost:3306/firstpracticedb";
	static String username = "root";
	static String password = "Nickynick77$";
	static Connection conn = null;

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, username, password);
			
			if(conn != null) {
				
				System.out.println("Connected");
				Statement st = conn.createStatement();
				String sql1 = "update practiceusers set first_name='Louis', last_name='Griffin' where email='yashik@gmail.com'";
				int i = st.executeUpdate(sql1);
				
				if(i > 0) {
					System.out.println("Successfully updated");
				}
				
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	

	}

}
