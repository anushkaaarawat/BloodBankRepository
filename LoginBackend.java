package data;
import java.sql.*;
public class LoginBackend {
      public static  boolean authenticateUser(String User,String pass) {
    	  try{
    		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpage","root","groot");
    		PreparedStatement stmt=conn.prepareStatement("select * from login where username=? and password=?");
    		stmt.setString(1, User);
    		stmt.setString(2, pass);
    		ResultSet rs=stmt.executeQuery();
    		if(rs.next()) {
    			conn.close();
    			return true;
    		}
    		else {
    			conn.close();
    			return false;
    		}
    	  }catch(SQLException e) {
    		  e.printStackTrace();
    		  return false;
    	  }
		
      }
}
