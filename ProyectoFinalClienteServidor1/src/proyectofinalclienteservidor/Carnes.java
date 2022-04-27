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
public class Carnes extends Comida implements Interfaz {

    protected String tipoCarne;
    protected int mesVencimiento;

    static List<Carnes> listaCarnes = new ArrayList();

    public Carnes(int precio, String nombre, String cantidadDisponible,String tipoCarne, int mesVencimiento) {
        super(precio, nombre, cantidadDisponible);
        this.tipoCarne = tipoCarne;
        this.mesVencimiento = mesVencimiento;
    }

    public Carnes() {
    }

        @Override
    public void agregar() {

        try {
            precio = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite el precio por kilogramo del producto"));

            nombre = JOptionPane.showInputDialog(null,
                    "Digite el nombre del producto");

            cantidadDisponible = JOptionPane.showInputDialog(null,
                    "Digite la cantidad de kilogramos disponibles");

            tipoCarne = JOptionPane.showInputDialog(null,
                    "Digite el tipo de carne");

            mesVencimiento = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite el nombre del mes de vencimiento"));
            
            listaCarnes.add(new Carnes(precio, nombre, cantidadDisponible, tipoCarne,
                    mesVencimiento));


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
                    "Digite el nombre del articulo que desea buscar",
                    "Consultar", -1);

            for (Carnes carnes : listaCarnes) {
                if (carnes.getNombre().equals(nombre)) {
                    JOptionPane.showMessageDialog(null,
                            "Datos del Cliente: \n\n"
                            + "Nombre: " + carnes.getNombre()
                            + "\nPrecio por Kilogramo: " + carnes.getPrecio()
                            + "\nCantidad de Kg disponibles: " + carnes.getCantidadDisponible()
                            + "\nTipo de Carne: " + carnes.getTipoCarne()
                            + "\nMes de Vencimiento: " + carnes.getMesVencimiento(),
                            "Informacion de Carnes",
                            -1);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Este producto no existe",
                            "Consultar", -1);

                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Dato no valido, favor digitar bien los valores");
            System.out.println(e);
        }

    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public int getMesVencimiento() {
        return mesVencimiento;
    }

    public void setMesVencimiento(int mesVencimiento) {
        this.mesVencimiento = mesVencimiento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(String cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

}
