package rcmDB;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import  java.sql.Statement;
import org.testng.annotations.Test;

import rcmUtility.BaseProperties;

import  java.sql.ResultSet;				
import  java.sql.SQLException;	

public class RCM_attachment_types extends BaseProperties {

	@Test
	public static void  read_rcm_attachment_types_table() throws  SQLException, ClassNotFoundException, IOException {													
		//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
		String dbUrl = getProperties("mySqlDBURL");					

		//Database Username		
		String username = getProperties("mySqlDBUserName");	

		//Database Password		
		String password = getProperties("mySqlDBPaswword");				

		//Query to Execute		
		String query = "SELECT * FROM rcm_attachment_types ORDER BY id DESC";	

		//Load mysql jdbc driver		
		Class.forName(getProperties("mySqlDBDriver"));			

		//Create Connection to DB		
		Connection con = DriverManager.getConnection(dbUrl,username,password);

		//Create Statement Object		
		Statement stmt = con.createStatement();					

		// Execute the SQL Query. Store results in ResultSet		
		ResultSet rs= stmt.executeQuery(query);							

		// While Loop to iterate through all data and print results		
		while (rs.next()){
			String id = rs.getString(1);								        
			String att_type = rs.getString(2);					                               
			System. out.println(id+" |  "+att_type);		
		}		
		//      		 closing DB Connection		
		con.close();			
	}
}

