package utils;

import java.sql.*;

public class ReinitializeDB {
	
	public static void reinitialize(Connection connection) throws SQLException{
		
		String dropTableSql = "DROP SCHEMA PUBLIC CASCADE";
		Statement dropTable = connection.createStatement();
		dropTable.execute(dropTableSql);
		
		String createTableSql = 
				"CREATE TABLE users("
				+ "id int GENERATED BY DEFAULT AS IDENTITY,"
				+ "login VARCHAR(20),"
				+ "password VARCHAR(20)"
				+ ")";
		Statement createTable = connection.createStatement();
		createTable.executeUpdate(createTableSql);
	}
}
