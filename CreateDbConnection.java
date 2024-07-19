package gradepro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDbConnection 
{

private static final String PATH="com.mysql.cj.jdbc.Driver";
	
	private static final String URL="jdbc:mysql://localhost:3306/stugradedb";
	
	private static final String USER="root";
	
	private static final String PASS="root";
	
	public static Connection createConnection()
	{
		//Registering drivers
		try 
		{
			Class.forName(PATH);
		}
		catch (ClassNotFoundException e) 
		{
			System.out.println("Issue in registering the server");
		}
		
		
		//creating Connections
		try
		{
			return DriverManager.getConnection(URL,USER,PASS);
		} 
		catch (SQLException e)
		{
			System.out.println("Issue in connecting DB");
			return null;
		}
			
	}
	
	

}
