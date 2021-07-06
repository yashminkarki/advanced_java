package assignment.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteWhere2 {
	static String url = "jdbc:mysql://localhost:3306/sampletb";
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
				String sql = "delete from personalInfo where id=18";
				
				int i = st.executeUpdate(sql);
				if(i > 0) {
					System.out.println("Deleted Successfully using Statement interface");
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
