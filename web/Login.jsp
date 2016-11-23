<%-- 
    Document   : Login
    Created on : 22/11/2016, 12:35:14 PM
    Author     : carias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/Login.css" rel="stylesheet" type="text/css"/>
        <title>Login</title>
    </head>
    <body>
        <table>
            <tr>
                <td>
                    <div id="">Usuario</div>
                </td>
                <td>
                    <input name="txtusuario" placeholder="Ingrese Usuario" type="text"   id="Campos" value="" >
                </td>       
            </tr>
            <tr>
                <td>
                    <div id="Partes">Clave</div>
                </td>
                <td>
                    <input name="txtclave" placeholder="Ingrese Clave" id="Campos"  type="password" >
                </td> 
            </tr>

            <tr>
                <td>
                    <button type="submit" name="action"  value="ingresar" class="btn1" >Aceptar</button>
                </td>
                <td>
                    <input type="button" value="Regresar" class="btn1" onClick=" window.location.href = 'index.jsp'">
                </td>
            </tr>
        </table>
    </body>
</html>
