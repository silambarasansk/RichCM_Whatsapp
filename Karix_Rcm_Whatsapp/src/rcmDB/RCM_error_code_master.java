package rcmDB;



import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import  java.sql.Statement;
import org.testng.annotations.Test;

import rcmUtility.BaseProperties;

import  java.sql.ResultSet;				
import  java.sql.SQLException;	

public class RCM_error_code_master extends BaseProperties {
	

	@Test
	public static void  read_rcm_error_code_master_table() throws  SQLException, ClassNotFoundException, IOException {													
		//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
		String dbUrl = getProperties("mySqlDBURL");					

		//Database Username		
		String username = getProperties("mySqlDBUserName");	

		//Database Password		
		String password = getProperties("mySqlDBPaswword");				

		//Query to Execute		
		String query = "SELECT * FROM rcm_error_code_master Limit 6 ";
//		System.out.println(count);

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
			String col1 = rs.getString(1);								        
			String col2 = rs.getString(2);
			String col3 = rs.getString(3);
			String col4 = rs.getString(4);
			String col5 = rs.getString(5);
			System. out.println(col1+" | "+col2+" | "+col3+" | "+col4+" | "+col5);			
		}		
		//      		 closing DB Connection		
		con.close();			
	}

}
