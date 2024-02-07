
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;


public class Controladora {
    ControladoraPersistencia controlPersis= new ControladoraPersistencia();
    
    public void crearCliente(Cliente client){
        controlPersis.crearCliente(client);
    }
    
    public List<Cliente>traerClientes(){
        return controlPersis.traerClientes();
    }

    public void borrarCliente(int idEliminar) {
        controlPersis.borrarCliente(idEliminar);
    }

    public Cliente traerUsuario(int idEditar) {
        return controlPersis.traerCliente(idEditar);
        
    }

    public void EditarCliente(Cliente client) {
        controlPersis.editarCliente(client);
    }
    
}
