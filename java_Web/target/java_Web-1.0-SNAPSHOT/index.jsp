<%-- 
    Document   : index
    Created on : 21 ago. 2024, 20:31:43
    Author     : 54221
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="estilos.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <h1>Formulario de registro</h1>
    </head>
    <body> 
        <form action="SvUsuarios" method="POST"> <%-- manda los dato mediante el metodo post al servlet --%> 
            <p><label>Nombre : </label> <input type="text" name="nombre"></p> 
            <p><label>Apellido : </label> <input type="text" name="apellido"></p>
            <p><label>Dni : </label> <input type="text" name="dni"></p>
            <p><label>Telefono : </label> <input type="text" name="telefono"></p>
            <button type="submit"> Enviar </button> 
        </form>
            
            <p></p>
            
            </<h2> <b>Lista de usuarios</b></h2>
            <p>Haga click para ver la lista de usuarios </p>
            <form action="SvUsuarios" method="GET">
                <button  type="submit"> Ver </button> 
            </form>
            
            <p></p>
            
            </<h2><b>Eliminar Usuario</b></h2>
             <p>Ingrese el id del usuario que quiere eliminar</p>
            <form action="SvEliminar" method="POST">
                <p><label>ID : </label> <input type="text" name="id"></p>
                <button type="submit"> Eliminar </button> 
            </form>
             
             <p></p>
             
              </<h2><b>Editar Usuario</b></h2>
             <p>Ingrese el id del usuario que quiere editar</p>
             <form action="SvEditar" method="GET"> <!-- Get pq primeto hay que traer el id -->
                <p><label>ID : </label> <input type="text" name="idEdit"></p>
                <button type="submit"> Editar </button> 
            </form>
             
             <p></p>

             
             

        
    </body>
</html>
