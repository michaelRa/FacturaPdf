package EG.GestionBD;
public class Login {
    public static String ValidarIngreso(String user, String pass) {
        return "SELECT * FROM usuarios WHERE usuario ='" + user + "' AND constraseña='"+ pass +"'";
    }    
}
