package src;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

public class dbconnect {
	
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public dbconnect(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
		}catch(Exception e){
			System.out.println("Error: " + e);
		}
	}
}
