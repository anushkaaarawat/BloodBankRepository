package data;
import java.sql.*;

public class takebackend {
	takebackend(String blood){
		try {
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpage","root","groot");
		PreparedStatement stmt=conn.prepareStatement("update inv set units=units-1 where blood_group=?");
		stmt.setString(1,blood);
		stmt.executeUpdate();
		stmt.close();
	
		}catch(SQLException e) {
			e.printStackTrace();
		}
}
}