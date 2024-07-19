package gradepro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;



public class StudentsGrades extends HttpServlet
{
	
	public static int getVal(int val)
	{
		System.out.println("----");
		return val;
	}
	
	//static Connection con=null;
	//static PreparedStatement pst=null;
	String query="select * from grades where RollNo=? and Name=?";

	public static   String getMarks(String roll,String name) throws SQLException, ClassNotFoundException
	{
		
//		 Connection con=null;
//		 PreparedStatement pst=null;
		String query="select * from grades where RollNo=? and Name=?";
		
		

		
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stugradedb", "root", "root");
			PreparedStatement pst=con.prepareStatement(query);

			//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stugradedb","root","root");
			System.out.println("Connection Established");
			
			//pst=con.prepareStatement(query);
			pst.setString(1, roll);
			pst.setString(2, name);
			System.out.println("Query is correct");
			
			String marks=null;
			ResultSet rs=pst.executeQuery();
			System.out.println("Query execued successfully");
			
			if(rs!=null)
			{
				while(rs.next())
				{
					//System.out.println(rs.getInt(1));
					//System.out.println(rs.getString(2));
					//System.out.println(rs.getString(3));
					marks=rs.getString(3);
				}
				
			}
			
			else
			{
				System.out.println("No data found");
			}
			pst.close();
			con.close();
			System.out.println("Connection and statement closed successfully");

			return marks;
		
		
		
		
		
		
		

	}
	public static void main(String[] args) 
	{
//		
//		try 
//		{
//			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stugradedb","root","root");
//			System.out.println("Connection Established");
//			
//		}
//		
//		catch (SQLException e) 
//		{
//			System.out.println("Isuue in connecting the database");
//		}
		
//		try 
//		{
//			String query="select * from grades where RollNo=? and Name=?";
//			
//			pst=con.prepareStatement(query);
//			pst.setInt(1, 8);
//			pst.setString(2, "Shraddha");
//			System.out.println("Query is correct");
//		} 
//		catch (SQLException e)
//		{
//			System.out.println("wrong query");
//		}
//		
//		 
//		try {
//			ResultSet rs=pst.executeQuery();
//			System.out.println("Query execued successfully");
//			while(rs.next())
//			{
//				//System.out.println(rs.getInt(1));
//				//System.out.println(rs.getString(2));
//				//System.out.println(rs.getString(3));
//				String marks=rs.getString(3);
//				
//			}
//		} 
//		catch (SQLException e) 
//		{
//			System.out.println("Query not executed");
//		}
		//getMarks(8, "Shraddha");
		
		try
		{
			System.out.println("Marks obtained="+ getMarks("8", "Shraddha"));
		}
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
//		try {
//			pst.close();
//			con.close();
//			System.out.println("Connection and statement closed successfully");
//		}
//		catch (SQLException e)
//		{
//			System.out.println("Problem in closing statements and connection");
//		}
//		
	}
	
	
}
