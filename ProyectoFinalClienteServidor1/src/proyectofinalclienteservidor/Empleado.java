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
public class Empleado extends Persona implements Interfaz {

    protected String annoIngreso;
    protected String idEmpleado;

    static List<Empleado> listaEmpleado = new ArrayList();
    
    
    public Empleado(String cedula, String nombre, String apellido1, String apellido2, String annoIngreso, String idEmpleado) {
        super(cedula, nombre, apellido1, apellido2);
        this.annoIngreso = annoIngreso;
        this.idEmpleado = idEmpleado;
    }

    public Empleado() {
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

            annoIngreso = JOptionPane.showInputDialog(null,
                    "Digite el año de inicio");
            
            idEmpleado = JOptionPane.showInputDialog(null,
                    "Digite un usuario para asignar al empleado");

            String evaluar = JOptionPane.showInputDialog(null,
                    "Digite: \n"
                    + "'1' si es cliente frecuente\n"
                    + "'0' si no es cliente frecuente");


            listaEmpleado.add(new Empleado(cedula, nombre, apellido1, apellido2,
                    annoIngreso, idEmpleado));

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
                    "Digite el numero de cedula del Empleado",
                    "Consultar", -1);

            for (Empleado empleado : listaEmpleado) {
                if (empleado.getCedula().equals(cedula)) {
                    JOptionPane.showMessageDialog(null,
                            "Datos del Empleado: \n\n"
                            + "Cedula: " + empleado.getCedula()
                            + "\nNombre: " + empleado.getNombre()
                            + "\nPrimer Apellido: " + empleado.getApellido1()
                            + "\nSegundo Apellido: " + empleado.getApellido2()
                            + "\nUsuario del Empleado: " + empleado.getIdEmpleado()
                            + "\nAño de inicio: " + empleado.getAnnoIngreso(),
                            "Informacion del Empleado",
                            -1);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Este Empleado no existe",
                            "Consultar", -1);

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dato no valido, favor digitar bien los valores");
            System.out.println(e);
        }

    }

    public String getAnnoIngreso() {
        return annoIngreso;
    }

    public void setAnnoIngreso(String annoIngreso) {
        this.annoIngreso = annoIngreso;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
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
