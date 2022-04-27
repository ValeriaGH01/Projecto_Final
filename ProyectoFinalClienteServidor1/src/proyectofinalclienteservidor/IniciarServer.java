/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package proyectofinalclienteservidor;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Valeria
 */
public class IniciarServer {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Server server = new Server();
        try {
            server.iniciarServer();
        } catch (IOException ex) {
            Logger.getLogger(IniciarServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IniciarServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
