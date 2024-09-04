/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Logica.Controladora;
import Logica.Usuario;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 *
 * @author 54221
 */
@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {
    
    Controladora controladora = new Controladora();

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Usuario> listaUsuarios = controladora.traerUsuarios();
      
        HttpSession miSesion = request.getSession(); //La sesion se crea automaticamente cuando un usuario entra
        miSesion.setAttribute("listaUsuarios",listaUsuarios); //a la sesion le seteo la lista de usuario           
            
        //redirecciono a otra pagina para que muestre todos los usuarios
        response.sendRedirect("mostrarUsuarios.jsp");                 
   }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
            
        
            String nombre = request.getParameter("nombre");                    
            String apellido = request.getParameter("apellido");
            String dni = request.getParameter("dni");
            String telefono = request.getParameter("telefono");
            
           Usuario usu = new Usuario ();
           
           usu.setNombre(nombre);
           usu.setApellido(apellido);
           usu.setDni(dni);
           usu.setTelefono(telefono);
           
           controladora.crearUsuario(usu);
            
           //redireccciono al index
           response.sendRedirect("index.jsp");

         
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
