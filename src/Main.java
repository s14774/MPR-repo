import java.sql.*;

import utils.ReinitializeDB;

public class Main {
	public static void main(String[] args) {

		String url="jdbc:hsqldb:hsql://localhost/workdb";
		
		try {
			Connection connection = DriverManager.getConnection(url);
			ReinitializeDB.reinitialize(connection);
						
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("koniec");
	}
}
