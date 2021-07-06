package assignment.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteWhere {
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
				
				PreparedStatement ps = conn.prepareStatement("delete from personalInfo where id=?");
				ps.setInt(1, 19);
				
				int i = ps.executeUpdate();
				if(i > 0) {
					System.out.println("Deleted Successfully using Prepared Statement interface");
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
