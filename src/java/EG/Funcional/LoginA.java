/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EG.Funcional;

import EG.Conexion.Conexion;
import EG.Datos.Usuarios;
import java.sql.Connection;

/**
 *
 * @author carias
 */
public class LoginA {
    
    public LoginB dao;

    public LoginA() {
        dao = new LoginB();
    }

    public Usuarios ValidarIngreso(String us, String pass) {
        Connection c;
        c = new Conexion().getCon();
        return dao.ValidarIngreso(c, us, pass);
    }
    
}
