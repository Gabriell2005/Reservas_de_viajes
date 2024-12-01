package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/reserva_de_viajes";
    private static final String USER = "root"; // Cambia si tienes otro usuario
    private static final String PASSWORD = ""; // Cambia si tienes contraseña

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
