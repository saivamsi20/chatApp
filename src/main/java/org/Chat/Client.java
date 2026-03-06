package org.Chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to server");
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello World");
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String reply =  in.readLine();
            System.out.println("Server Response: " + reply);
            socket.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}