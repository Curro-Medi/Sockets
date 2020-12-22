package Sockets;

import java.io.IOException;
import Sockets.Servidor;


//Clase principal que hará uso del servidor
public class MainServidor
{
    public static void main(String[] args) throws IOException
    {
    	
    	//Solo conseguimos que el cliente mande mensajes al servidor sin poder enviar mensajes del servidor al cliente
    	
    	do{
    		Servidor serv = new Servidor(); //Se crea el servidor
            serv.startServer(); //Se inicia el servidor
            
    	}while(true);

    }
}