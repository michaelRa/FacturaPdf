package EG.Conexion;

import java.sql.*;

public class Conexion {
    public Connection con;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/facturacioneg", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ClassNotFoundException  :"
                    + e.getMessage());
        }

        return con;
    }

    public Connection getCon() {
        conexion();
        return con;
    }

    
    public void setCon(Connection con) {
        this.con = con;
    }

    public void cerrarConexion() throws SQLException {
        this.con.close();
    }
}
