package UT4;

import org.apache.commons.net.pop3.POP3MessageInfo;
import org.apache.commons.net.pop3.POP3SClient;

import java.io.IOException;
import java.net.SocketException;

public class Ejemplo1POP3 {
    public static void main(String[] args) {
        String server = "localhost", username = "usu1", password = "usu1";
        int puerto = 110;
        POP3SClient pop3 = new POP3SClient();
        try {
            // nos conectamos al servidor
            pop3.connect(server, puerto);
            System.out.println("Conexión realizada al servidor POP3 " + server);

            // iniciamos sesión
            if (!pop3.login(username, password))
                System.err.println("Error al hacer login");
            else {
                // obtenemos todos los mensajes en un aray
                POP3MessageInfo[] men = pop3.listMessages();
                if (men == null)
                    System.out.println("Imposible recuperar mensajes.");
                else
                    System.out.println("Nº de mensajes " + men.length);

                // finalizar sesión
                pop3.logout();
            }
            // nos desconectamos
            pop3.disconnect();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
        System.exit(0);
    }// main
} // ..Ejemplo1POP3
