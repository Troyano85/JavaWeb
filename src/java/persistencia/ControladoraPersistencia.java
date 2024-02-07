
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Cliente;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    
    ClienteJpaController clientJpa =new ClienteJpaController();
    
    //operación CREATE
    public void crearCliente(Cliente client){
        clientJpa.create(client);
    }
    
    //operación READ
    public List<Cliente> traerClientes(){
        return clientJpa.findClienteEntities();
        
    }

    public void borrarCliente(int idEliminar) {
        try {
            clientJpa.destroy(idEliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cliente traerCliente(int idEditar) {
        return clientJpa.findCliente(idEditar);
    }

    public void editarCliente(Cliente client) {
        try {
            clientJpa.edit(client);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
