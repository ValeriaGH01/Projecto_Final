/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalclienteservidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Valeria
 */
public class Server {

    private final int PUERTO = 1234;

    private ServerSocket ss;
    private ObjectOutputStream conexionSalidaCliente;
    private ObjectInputStream conexionEntradaCliente;
    private Socket cs;

    private Comando comandoActual;

    private Comprador comprador;
    private Empleado empleado;
    private Enlatados enlatados;
    private Carnes carnes;
    private Proveedores proveedores;

    public Server() {
        try {
            this.ss = new ServerSocket(PUERTO);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void iniciarServer() throws IOException, ClassNotFoundException {
        System.out.println("Esperando...");

        cs = ss.accept();

        System.out.println("Cliente en línea");

        conexionSalidaCliente = new ObjectOutputStream(cs.getOutputStream());
        conexionEntradaCliente = new ObjectInputStream(cs.getInputStream());
        Object objeto;

        while ((objeto = conexionEntradaCliente.readObject()) != null) {

            comandoActual = (Comando) objeto;

            switch (comandoActual.getClase()) {
                case "Comprador":

                    switch (comandoActual.getOpcion()) {
                        case 1:

                            comprador.agregar();
                            conexionSalidaCliente.writeObject(new Comando("Confirmacion", 1));
                            break;
                        case 2:
                            comprador.consultar();
                            conexionSalidaCliente.writeObject(new Comando("Confirmacion", 1));
                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                        default:
                            break;
                    }
                    break;
                case "Empleado":

                    switch (comandoActual.getOpcion()) {
                        case 1:

                            empleado.agregar();
                            conexionSalidaCliente.writeObject(new Comando("Confirmacion", 1));
                            break;
                        case 2:
                            empleado.consultar();
                            conexionSalidaCliente.writeObject(new Comando("Confirmacion", 1));
                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                        default:
                            break;
                    }
                    break;
                case "Proveedores":

                    switch (comandoActual.getOpcion()) {
                        case 1:
                            proveedores.agregar();
                            conexionSalidaCliente.writeObject(new Comando("Confirmacion", 1));
                            break;
                        case 2:
                            proveedores.consultar();
                            conexionSalidaCliente.writeObject(new Comando("Confirmacion", 1));
                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                        default:
                            break;
                    }
                    break;
                case "Carnes":

                    switch (comandoActual.getOpcion()) {
                        case 1:
                            carnes.agregar();
                            conexionSalidaCliente.writeObject(new Comando("Confirmacion", 1));
                            break;
                        case 2:
                            carnes.consultar();
                            conexionSalidaCliente.writeObject(new Comando("Confirmacion", 1));
                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                        default:
                            break;
                    }
                    break;
                case "Enlatados":

                    switch (comandoActual.getOpcion()) {
                        case 1:
                            enlatados.agregar();
                            conexionSalidaCliente.writeObject(new Comando("Confirmacion", 1));
                            break;
                        case 2:
                            enlatados.consultar();
                            conexionSalidaCliente.writeObject(new Comando("Confirmacion", 1));
                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                        default:
                            break;
                    }
                    break;
                default:

                    break;
            }

        }
        System.out.println("Cerrando server");
    }

 
}
