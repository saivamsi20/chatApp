package org.Chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server Started");

            Socket socket = serverSocket.accept();
            System.out.println("Accepted connection");

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String message = in.readLine();
            System.out.println("Message received: " + message);

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("hello server");
            serverSocket.close();
            socket.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}