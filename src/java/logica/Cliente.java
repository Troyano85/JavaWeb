
package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String nombreDueno;
   private String celular;
   private String nombreMascota;
   private String raza;
   private String observaciones;

    public Cliente() {
    }

    public Cliente(int codigo, String nombreDueno, String celular, String nombreMascota, String raza, String observaciones) {
        this.id = id;
        this.nombreDueno = nombreDueno;
        this.celular = celular;
        this.nombreMascota = nombreMascota;
        this.raza = raza;
        this.observaciones = observaciones;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int codigo) {
        this.id = id;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
   
   
    
    
}
