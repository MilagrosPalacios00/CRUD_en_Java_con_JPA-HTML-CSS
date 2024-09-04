<%-- 
    Document   : mostrarUsuarios
    Created on : 22 ago. 2024, 16:02:29
    Author     : 54221
--%>

<%@page import="Logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="estilos.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Usuarios</title>
    </head>
    <body>
        <h1>Lista de usuarios</h1>
        
        <%
            List<Usuario> listaUsuarios = (List<Usuario>) request.getSession().getAttribute("listaUsuarios"); //creo una lista y le asigno el atributo de la sesion
           
            for (Usuario u : listaUsuarios){                        
        %>
        
        <div class="datos"> 
        <p><b>Usuario ID: <%= u.getId() %></b></p> 
        <p>Nombre: <%= u.getNombre() %></p>
        <p>Apellido: <%= u.getApellido() %></p>
        <p>DNI: <%= u.getDni() %></p>
        <p>Teléfono: <%= u.getTelefono() %></p>
        
        </div>
        
        <p>------------------------------------</p>
        
        
         
        
        
        <%}%>
        
        
    </body>
</html>
