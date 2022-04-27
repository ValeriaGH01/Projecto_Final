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
public class Enlatados extends Comida implements Interfaz {

    protected String tipoEnlatado;
    protected String marca;

    static List<Enlatados> listaEnlatados = new ArrayList();

    public Enlatados(int precio, String nombre, String cantidadDisponible, String tipoEnlatado, String marca) {
        super(precio, nombre, cantidadDisponible);
        this.tipoEnlatado = tipoEnlatado;
        this.marca = marca;
    }

    public Enlatados() {
    }

    @Override
    public void agregar() {

        try {
            precio = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite el precio por unidad del producto"));

            nombre = JOptionPane.showInputDialog(null,
                    "Digite el nombre del producto");

            cantidadDisponible = JOptionPane.showInputDialog(null,
                    "Digite la cantidad de unidades disponibles");

            tipoEnlatado = JOptionPane.showInputDialog(null,
                    "Digite cual enlatado está ingresando");

            marca = JOptionPane.showInputDialog(null,
                    "Digite un usuario para asignar al cliente");

            listaEnlatados.add(new Enlatados(precio, nombre, cantidadDisponible, tipoEnlatado,
                    marca));

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

            for (Enlatados enlatados : listaEnlatados) {
                if (enlatados.getNombre().equals(nombre)) {
                    JOptionPane.showMessageDialog(null,
                            "Datos del Producto: \n\n"
                            + "Nombre: " + enlatados.getNombre()
                            + "\nPrecio por unidad: " + enlatados.getPrecio()
                            + "\nCantidad Disponibles: " + enlatados.getCantidadDisponible()
                            + "\nTipo de Enlatado: " + enlatados.getTipoEnlatado()
                            + "\nMarca: " + enlatados.getMarca(),
                            "Informacion del enlatado",
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

    public String getTipoEnlatado() {
        return tipoEnlatado;
    }

    public void setTipoEnlatado(String tipoEnlatado) {
        this.tipoEnlatado = tipoEnlatado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
