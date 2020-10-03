import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDriver {
  public static Connection connectToDatabase() {
    Connection connection = null;
    String server = "localhost";
    String schema = "HL";
    String url = "jdbc:mysql://" + server + "/" + schema;
    String username = "root";
    String password = "";
    try {
        connection = DriverManager.getConnection(url, username, password);
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return connection;
  }
}
