/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalclienteservidor;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Saul Hernandez
 */
public class Comprador extends Persona implements Interfaz {

    protected String clienteID;
    protected boolean compradorFrecuente;
    
    static List<Comprador> listaComprador = new ArrayList();

    public Comprador(String cedula, String nombre) {
        super(cedula, nombre);
    }

    public Comprador(String cedula, String nombre, String apellido1, String apellido2, String clienteID, boolean compradorFrecuente) {
        super(cedula, nombre, apellido1, apellido2);
        this.clienteID = clienteID;
        this.compradorFrecuente = compradorFrecuente;
    }

    public Comprador() {
    }

    @Override
    public void agregar() {

        try {
            cedula = JOptionPane.showInputDialog(null,
                    "Digite el numero de cedula del cliente");

            nombre = JOptionPane.showInputDialog(null,
                    "Digite el nombre del cliente");

            apellido1 = JOptionPane.showInputDialog(null,
                    "Digite el primer apellido del cliente");

            apellido2 = JOptionPane.showInputDialog(null,
                    "Digite el segundo apellido del cliente");

            clienteID = JOptionPane.showInputDialog(null,
                    "Digite un usuario para asignar al cliente");


            String evaluar = JOptionPane.showInputDialog(null,
                    "Digite: \n"
                    + "'1' si es cliente frecuente\n"
                    + "'0' si no es cliente frecuente");

            if (evaluar.equals("1")) {
                compradorFrecuente = true;
            } else {
                compradorFrecuente = false;
            }


            listaComprador.add(new Comprador(cedula, nombre, apellido1, apellido2,
                    clienteID, compradorFrecuente));

           JOptionPane.showMessageDialog(null, "Datos guardados exitosamente");
           

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dato no valido, favor digitar bien los valores");
            System.out.println(e);
        }

    }
    
    

    @Override
    public void consultar() {
        
        try {
            
            String cedula = JOptionPane.showInputDialog(null,
                            "Digite el numero de cedula del cliente",
                            "Consultar", -1);
            
            for (Comprador comprador : listaComprador) {
                if (comprador.getCedula().equals(cedula)) {
                    JOptionPane.showMessageDialog(null,
                            "Datos del Cliente: \n\n" 
                            + "Cedula: " + comprador.getCedula()
                            + "\nNombre: " + comprador.getNombre()
                            + "\nPrimer Apellido: " + comprador.getApellido1()
                            + "\nSegundo Apellido: " + comprador.getApellido2()
                            + "\nUsuario del Cliente: " + comprador.getClienteID()
                            + "\nCliente Frecuente: " + comprador.isCompradorFrecuente(),
                            
                            "Informacion del Cliente",
                            -1);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Este cliente no existe",
                            "Consultar", -1);
                    
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dato no valido, favor digitar bien los valores");
            System.out.println(e);
        }
        
    }

    public String getClienteID() {
        return clienteID;
    }

    public void setClienteID(String clienteID) {
        this.clienteID = clienteID;
    }

    public boolean isCompradorFrecuente() {
        return compradorFrecuente;
    }

    public void setCompradorFrecuente(boolean compradorFrecuente) {
        this.compradorFrecuente = compradorFrecuente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

}
