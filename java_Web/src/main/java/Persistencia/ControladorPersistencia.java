
package Persistencia;

import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorPersistencia {
    
    UsuarioJpaController usuJpa = new UsuarioJpaController ();
    
    //Operacion Create
    public void crearUsuario (Usuario usu){
        usuJpa.create(usu);      
    }
    
    //Operacion Read
    public List<Usuario> traerUsuarios (){
        return usuJpa.findUsuarioEntities();      
    }
    
    //Operacion delate 
    public void borrarUsuario (int id){
        try {
            usuJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Operacion update 
    public Usuario traerUsuario (int id){
        return usuJpa.findUsuario(id);
        
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
