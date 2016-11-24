package EG.Funcional;

import EG.Datos.Usuarios;
import EG.GestionBD.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginB {
    
    public Usuarios ValidarIngreso(Connection con, String user, String pass) {
        Usuarios u = new Usuarios();
        u.setUsuario("0");
        try {
            PreparedStatement p = con.prepareStatement(Login.ValidarIngreso(user, pass));
            ResultSet r = p.executeQuery();
            while (r.next()) {
                u.setUsuario(r.getString(1));
                u.setContraseña(r.getString(2));
            }
        } catch (Exception e) {
            u.setUsuario("0");
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                
            }
        }
        return u;
    }    
}
