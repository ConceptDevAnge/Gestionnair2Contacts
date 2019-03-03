package data.access.layer;

//STEP 1. Import required packages
import java.sql.*;

public class MySQLConnector {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/gestioncontact";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "";

	public static void test(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT pseudo, Civilite, nom, prenom, adresse, codepostal, ville FROM contacts";
			ResultSet rs = stmt.executeQuery(sql);

			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				String pseudo = rs.getString("pseudo");
				int Civilite = rs.getInt("Civilite");
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String adresse = rs.getString("adresse");
				int codepostal = rs.getInt("codepostal");
				String ville = rs.getString("ville");

				// Display values
				System.out.print("Pseudonyme: " + pseudo);
				System.out.print(", Civilité: " + Civilite);
				System.out.print(", Nom: " + nom);
				System.out.print(", Prénom: " + prenom);
				System.out.print(", Adresse: " + adresse);
				System.out.print(", Code postal: " + codepostal);
				System.out.print(", Ville: " + ville);
				System.out.println();
			}
			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
	}// end main

}
