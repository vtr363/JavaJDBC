package bancojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTeste {
	public static void main(String[] args) {
		
		try {
			Connection con = DriverManager.getConnection(url, usuario, senha);
			System.out.println("foi");
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
