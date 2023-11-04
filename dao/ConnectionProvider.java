package dao;


import java.sql.*;
public class ConnectionProvider {
	public static Connection getCon() { 
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","jovi12102001");
	return con;
			
		}catch(Exception e){
			return null;
			}
	
	
	}
	
}