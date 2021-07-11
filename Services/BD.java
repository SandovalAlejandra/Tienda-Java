
package Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD {
    private final String database = "jdbc:mysql://localhost:3306/Tienda";
    private final String password = "";
    private final String user = "root";

    public Connection getConnection() {

        Connection conexion = null;
        try {
            /*String connectionUrl = "jdbc:sqlserver://" + server + ":1433;"
                    + "databaseName=" + database + ";"
                    + "integratedSecurity=true;";
            */
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(database, user, password);
            return conexion;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error." + ex.getMessage());
        }
        return conexion;
    }
}
