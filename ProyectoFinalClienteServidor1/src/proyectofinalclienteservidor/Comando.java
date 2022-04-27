/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalclienteservidor;

import java.io.Serializable;

/**
 *
 * @author Valeria
 */
public class Comando implements Serializable{
    private String clase;
    private int opcion;

    public Comando(String clase, int opcion) {
        this.clase = clase;
        this.opcion = opcion;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    @Override
    public String toString() {
        return "Comando{" + "clase=" + clase + ", opcion=" + opcion + '}';
    }
    
    
}
