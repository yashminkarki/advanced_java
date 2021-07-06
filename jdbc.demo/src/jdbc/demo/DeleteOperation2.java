package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteOperation2 {
	//delete operation using Statement interface

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
					String sql = "delete from practiceusers where id=1";
					
					int i = st.executeUpdate(sql);
					
					if(i>0){
						System.out.println("successfully deleted from statement interface");
					}	
								
				}
				
			}
			catch(Exception e) {
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
