package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbConnection {

  public static void main(String[] args)  {
    try {
      String host = "localhost";
      int port = 8889;
      String dbName = "week6";
      String dbURL = "jdbc:mysql://" + host + ":" + port + "/" + dbName + "?useSSL=false";

      String username = "root";
      String password = "root";

      String sql = "select * from member_v where username=?";

      // step 1: Loads the JDBC driver
      Class.forName("com.mysql.jdbc.Driver").getConstructor().newInstance();

      // step 2: Gets a connection to the database
      Connection conn = DriverManager.getConnection(dbURL, username, password);

      // step 3: Prepare the SQL to be sent to the database
      PreparedStatement stmt = conn.prepareStatement(sql);
      // bind the parameters
      stmt.setString(1, "apple");

      // step 4: executes the query
      ResultSet rs = stmt.executeQuery();
      while (rs.next()) {
        System.out.println(rs.getString("full_name"));
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
