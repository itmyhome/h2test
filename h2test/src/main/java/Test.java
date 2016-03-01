import java.sql.*;
import org.h2.jdbcx.JdbcConnectionPool;

public class Test {
	public static void main(String... args) throws Exception {
		JdbcConnectionPool cp = JdbcConnectionPool.create("jdbc:h2:~/test",
				"sa", "");
		Connection conn = cp.getConnection();
		PreparedStatement pstmt = null;

		pstmt = conn.prepareStatement("select count(1) from T_SYS_LOG ");
		pstmt.executeQuery();

		ResultSet rs = pstmt.getResultSet();
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String countryCode = rs.getString(3);
			String district = rs.getString(4);
			int population = rs.getInt(5);

			/*
			 * Display values
			 */
			System.out.print("ID: " + id);
			System.out.print(", Name: " + name);
			System.out.print(", CountryCode: " + countryCode);
			System.out.print(", District: " + district);
			System.out.println(", Population: " + population);

			name = rs.getString("CountryCode");
			System.out.println(", Getby Column Name CountryCode: " + name);

		}

		conn.close();
		cp.dispose();
	}
}