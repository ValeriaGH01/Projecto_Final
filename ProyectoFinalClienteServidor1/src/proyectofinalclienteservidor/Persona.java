/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalclienteservidor;

import java.io.Serializable;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Saul Hernandez
 */
public  class Persona implements Serializable{

    protected String cedula;
    protected String nombre;
    protected String apellido1;
    protected String apellido2;

    public Persona(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    
    
    public Persona(String cedula, String nombre, String apellido1, String apellido2) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public Persona(){}
    
    

    
}
