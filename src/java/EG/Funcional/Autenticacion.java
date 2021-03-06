/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EG.Funcional;

import EG.Datos.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author carias
 */
public class Autenticacion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String user = request.getParameter("txtusuario");
        String clave = request.getParameter("txtclave");
        request.setAttribute("mensajeError", null);
        request.setAttribute("target", null);
        String men = "";
        LoginA un = new LoginA();
        Usuarios u = new Usuarios();

        if ("".equals(user) || null == user) {
            men = "Error:<br> Ingrese el usuario";
        }
        if ("".equals(clave) || null == clave) {
            men = "Error:<br> Ingrese la  Contraseña";
        }
        if ("".equals(user) || null == user) {
            if ("".equals(clave) || null == clave) {
                men = "Error:<br> Ingrese Usuario y Contraseña";
            }
        }

        if ("".equals(men)) {
            u = un.ValidarIngreso(user, clave);
            if (u.getUsuario() != "0") {
                request.getSession(true).setAttribute("Usuario", u);
                request.setAttribute("target", "./Montaje.jsp");
            } else {
                request.setAttribute("target", "./Login.jsp");
                men = "Error:<br> Los datos son incorrectos";

            }
        }// si se ingresaron todos datos

        request.setAttribute("mensajeError", men);
        request.getRequestDispatcher("./Principal.jsp").forward(request, response);
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
