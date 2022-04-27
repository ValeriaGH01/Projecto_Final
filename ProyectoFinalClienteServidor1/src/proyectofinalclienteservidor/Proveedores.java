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
public class Proveedores extends Persona implements Interfaz {

    protected String nombreProveedor;
    protected String tipoProducto;
    protected boolean transporte;

    static List<Proveedores> listaProveedores = new ArrayList();

    public Proveedores(String nombreProveedor, String tipoProducto, boolean transporte) {
        this.nombreProveedor = nombreProveedor;
        this.tipoProducto = tipoProducto;
        this.transporte = transporte;
    }

    public Proveedores() {
    }

    @Override
    public void agregar() {

        try {
            nombreProveedor = JOptionPane.showInputDialog(null,
                    "Digite el nombre del Proveedor");

            tipoProducto = JOptionPane.showInputDialog(null,
                    "Digite el tipo de producto que entrega");

            String evaluar = JOptionPane.showInputDialog(null,
                    "Digite: \n"
                    + "'1' si es ofrece transporte\n"
                    + "'0' si no es ofrece transporte");

            if (evaluar.equals("1")) {
                transporte = true;
            } else {
                transporte = false;
            }

            listaProveedores.add(new Proveedores(nombreProveedor, tipoProducto, transporte));

            JOptionPane.showMessageDialog(null, "Datos guardados exitosamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dato no valido, favor digitar bien los valores");
            System.out.println(e);
        }

    }

    @Override
    public void consultar() {

        try {

            String nombre = JOptionPane.showInputDialog(null,
                    "Digite el nombre del proveedor",
                    "Consultar", -1);

            for (Proveedores proveedores : listaProveedores) {
                if (proveedores.getNombreProveedor().equals(nombre)) {
                    JOptionPane.showMessageDialog(null,
                            "Datos del Proveedor: \n\n"
                            + "Nombre: " + proveedores.getNombreProveedor()
                            + "\nProducto que provee: " + proveedores.getTipoProducto()
                            + "\nCuenta con transporte: " + proveedores.isTransporte(),
                            "Informacion del Cliente",
                            -1);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Este proveedor no está en el sistema",
                            "Consultar", -1);

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dato no valido, favor digitar bien los valores");
            System.out.println(e);
        }

    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public boolean isTransporte() {
        return transporte;
    }

    public void setTransporte(boolean transporte) {
        this.transporte = transporte;
    }

}
