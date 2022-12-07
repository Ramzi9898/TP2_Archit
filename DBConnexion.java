import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

		String BDD = "nomBD";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    private Connection conn;
		private static String url = "jdbc:mysql://localhost:3306/nombd";
		private static String user = "root";
		private static String passwd = "";
	    private static Connection conn;


	    public DBConnection() throws SQLException {
			conn=DriverManager.getConnection(url, user,passwd);
		}
	    private  DBConnection() {}


	    public Connection getConn() {
	    public static Connection getConn() throws SQLException {
	    	if(conn==null) {
	    		conn=DriverManager.getConnection(url, user,passwd);
	    	}
			return conn;
		}