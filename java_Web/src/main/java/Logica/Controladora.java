
package Logica;
import Persistencia.ControladorPersistencia;
import java.util.List;


public class Controladora {
    
    ControladorPersistencia controlPersis = new ControladorPersistencia();    
    
    public void crearUsuario (Usuario usu){
        controlPersis.crearUsuario(usu);        
    }
    
    public List<Usuario> traerUsuarios (){
        return controlPersis.traerUsuarios();
    }
    
    public void borrarUsuario (int id){
        controlPersis.borrarUsuario(id);
    }
    
    public Usuario traerUsuario (int id){
        return controlPersis.traerUsuario(id);
    }

    public void editarUsuario(Usuario usu) {
        controlPersis.editarUsuario (usu);
    }
    
    
    
    
}
