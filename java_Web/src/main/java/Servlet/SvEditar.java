/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Logica.Controladora;
import Logica.Usuario;
import java.io.IOException;
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
@WebServlet(name = "SvEditar", urlPatterns = {"/SvEditar"})
public class SvEditar extends HttpServlet {
    
    Controladora controladora = new Controladora();

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            int id = Integer.parseInt( request.getParameter("idEdit"));
            Usuario usu = controladora.traerUsuario(id);
            
            response.sendRedirect("editarUsuario.jsp");
            
            HttpSession miSesion = request.getSession(); //La sesion se crea automaticamente cuando un usuario entra
            miSesion.setAttribute("usuEdit",usu); //a la sesion le seteo la lista de usuario   
            
          
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String nombre = request.getParameter("nombre");                    
            String apellido = request.getParameter("apellido");
            String dni = request.getParameter("dni");
            String telefono = request.getParameter("telefono");
            
           Usuario usu = (Usuario) request.getSession().getAttribute("usuEdit"); 
           
           usu.setNombre(nombre);
           usu.setApellido(apellido);
           usu.setDni(dni);
           usu.setTelefono(telefono);
           
           controladora.editarUsuario(usu);
            
           //redireccciono al index
           response.sendRedirect("index.jsp");
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
