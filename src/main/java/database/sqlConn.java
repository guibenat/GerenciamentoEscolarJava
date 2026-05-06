package database;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class sqlConn {
    private static final String url = "jdbc:mysql://localhost:3306/sistema_escolar";
    private static final String pwd = "Senai@134";
    private static final String user = "root";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, pwd);
    }
    public static void testConnection() {

        try(Connection connection = getConnection()){
            System.out.println("Conexão foi bem estabelecida" + connection);
        } catch (SQLException e) {
            System.out.println("Falha na conexão" + e.getMessage());
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }
    }



}
