package EG.GestionBD;
public class Login {
    public static String ValidarIngreso(String user, String pass) {
        return "SELECT * FROM usuairos WHERE usuario ='" + user + "' AND contraseña='"+ pass +"'";
    }    
}
