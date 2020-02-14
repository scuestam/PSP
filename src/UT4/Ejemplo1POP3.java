package UT4;

import org.apache.commons.net.pop3.POP3MessageInfo;
import org.apache.commons.net.pop3.POP3SClient;

import java.io.BufferedReader;
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

    private static void recuperaMensajes(POP3MessageInfo[] men, POP3SClient pop3) throws IOException{
        for(int i = 0;i<men.length;i++){
            System.out.println("Mensaje: "+(i+1));
            POP3MessageInfo msginfo = men [i]; // lista de mensajes
            System.out.println("IDentificador: "+msginfo.identifier+", Number:"+msginfo.number+", Tamaño: "+msginfo.size);

            System.out.println("Prueba de listUniqueIdentifier: ");
            POP3MessageInfo pmi =pop3.listUniqueIdentifier(i+1); // un mensaje
            System.out.println("\tIDentificador: "+pmi.identifier+", Number: "+pmi.number+", Tamaño: "+pmi.size);
        } // for
    } // Recuperamensajes

    private static void recuperaCabeceras(POP3MessageInfo[] men, POP3SClient pop3) throws IOException{
        for(int i = 0;i<men.length;i++){
            System.out.println("Mensaje: "+(i+1));
            POP3MessageInfo msginfo = men [i]; // lista de mensajes

            // solo recupera la cabecera
            System.out.println("Cabecera del mensaje: ");
            BufferedReader reader = (BufferedReader) pop3.retrieveMessageTop(msginfo.number,0);
            String linea;
            while((linea=reader.readLine()) != null){
                System.out.println(linea.toString());
            }
            reader.close();
        } // for
    } // Recuperacabeceras

} // ..Ejemplo1POP3
