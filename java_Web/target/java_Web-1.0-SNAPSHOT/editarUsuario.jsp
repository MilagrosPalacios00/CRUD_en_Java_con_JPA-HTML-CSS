<%-- 
    Document   : editarUsuario
    Created on : 26 ago. 2024, 20:17:54
    Author     : 54221
--%>

<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link rel="stylesheet" href="estilos.css">
        <title>JSP Page</title>   
    </head>
    <body>
         <%
            Usuario u   = (Usuario) request.getSession().getAttribute("usuEdit"); //creo una usuario y le asigno el atributo de la sesion                                           
         %>
             
        <form action="SvEditar" method="POST"> <%-- manda los dato mediante el metodo post al servlet --%>
            <p><label>Nombre : </label> <input type="text" name="nombre" value="<%= u.getNombre() %>"</p>
            <p><label>Apellido : </label> <input type="text" name="apellido" value="<%= u.getApellido() %>"></p>
            <p><label>Dni : </label> <input type="text" name="dni" value="<%= u.getDni() %>"></p>
            <p><label>Telefono : </label> <input type="text" name="telefono" value="<%= u.getTelefono() %>"></p>
            <button type="submit"> Guardar </button> 
        </form>
       
        </div>
    </body>
</html>
