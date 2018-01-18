package postgresDbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UserDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1234");
			c.setAutoCommit(false);
			System.out.println("Opened database successfully");

			stmt = c.createStatement();
			String sql = "INSERT INTO USERS (id, name, email, mobile, password, user_type, code)" + " VALUES (101, 'jack', 'jack@gmail.com', 9425456654, '123', 'admin', 'NULL');";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO USERS (id, name, email, mobile, password, user_type, code)" + "VALUES (102, 'mak', 'mak@gmail.com', 9425456600, '123', 'admin', 'NULL');";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO USERS (id, name, email, mobile, password, user_type, code)" + "VALUES (103,'max', 'max@gmail.com', 9425226654, '123', 'client', 'NULL');";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO USERS (id, name, email, mobile, password, user_type, code)" + "VALUES (104,'jhon', 'jhon@gmail.com', 9425457754, '123', 'client', 'NULL');";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO USERS (id, name, email, mobile, password, user_type, code)" + "VALUES (105,'smith', 'smith@gmail.com', 9895456654, '123', 'employee', 'NULL');";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO USERS (id, name, email, mobile, password, user_type, code)" + "VALUES (106,'jimmy', 'jimmy@gmail.com', 9427756232, '123', 'employee', 'NULL');";
			stmt.executeUpdate(sql);

			stmt.close();
			c.commit();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Records created successfully");

	}

	}

