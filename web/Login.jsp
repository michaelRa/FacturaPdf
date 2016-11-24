<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        String mensajeError = (String) request.getAttribute("mensajeError");
        String usuario = request.getParameter("Usuario") == null ? "" : request.getParameter("Usuario");
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/Login.css" rel="stylesheet" type="text/css"/>
        <title>Login</title>
    </head>
    <body>
        <form name ="xForm" method="POST" action="./Autenticacion" />
        <div id="loginDIV">
            <p>Elico Group</p>
            <div id="tabla">

                <table border="0">

                    <tr>
                        <td>
                            <div id="">Usuario</div>
                        </td>
                        <td>
                    <center><input name="txtusuario" placeholder="Ingrese Usuario" type="text"   id="Campos" value="" ></center>
                    </td>       
                    </tr>
                    <tr>
                        <td>
                            <div id="Partes">Clave</div>
                        </td>
                        <td>
                    <center><input name="txtclave" placeholder="Ingrese Clave" id="Campos"  type="password" ></center>
                    </td> 
                    </tr>

                    <tr>
                        <td>
                            <button type="submit" name="action"  value="ingresar" id="botones" >Aceptar</button>
                        </td>
                        <td>
                    <center><input type="button" value="Regresar" id="botones" onClick=" window.location.href = 'index.jsp'"></center>
                    </td>
                    </tr>
                    <%if (mensajeError != null) {%>
                            <%=mensajeError%>
                            <%}%>

                </table>

            </div>
        </div>
    </form>
</body>
</html>
