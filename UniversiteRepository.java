import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class UniversiteRepository {
	

	Universite GetById(int universityId) throws SQLException {

		DBConnection BD= new DBConnection();
		Connection connect=BD.getConn(); 
		//DBConnection BD= new DBConnection();
		Connection connect=DBConnection.getConn(); 
		Statement stmt = connect.createStatement();
		System.out.println("LogBD : début recherche de id université dans la base de donnée");

@@ -23,7 +23,7 @@ Universite GetById(int universityId) throws SQLException {

		System.out.println("LogBD : université récupérée");

		connect.close();
		//connect.close();
		return u;	


	}	
	
}