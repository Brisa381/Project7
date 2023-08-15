package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import projects.exception.DbException;

@SuppressWarnings("unused")
public class DbConnection {
private static final String SCHEMA = "projects";
private static final String USER = "projects";
private static final String PASSWORD = "projects";
private static final String HOST = "localhost";
private static final int PORT = 3306;

public static void getConnection() {
	String url =
			String.format("jdbc:mysql://%s:%d/%s7user=%s&password=%s&useSSL=false",
					 HOST, PORT, SCHEMA, USER, PASSWORD);
	
	System.out.println("Connecting with url=" + url);
	
	try {
		Connection conn = DriverManager.getConnection(url);
		System.out.println("Successfully obtained connection!");
		return;
	} catch (SQLException e) {
		System.out.println("Error getting connection.");
		throw new DbException(e);
	   }
      } 	
	
	
	
}

