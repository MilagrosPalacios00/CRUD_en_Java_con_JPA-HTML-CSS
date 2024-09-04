/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author 54221
 */
@Entity
public class Usuario implements Serializable {
        
    @Id //primaryKey
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
     
     @Basic //campos que no tiene nada en particular
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;

    
    public Usuario(){}

    public Usuario(int id , String nombre, String apellido, String dni, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    @Override
    public String toString() {
        return "Nombre : " + nombre + ", apellido : " + apellido + ", dni : " + dni + ", telefono : " + telefono ;
    } 
    
    
    
}
