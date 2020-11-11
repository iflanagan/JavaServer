package com.IanFlanagan;

import java.io.*;
import java.net.Socket;

public class Echoer extends Thread {

    private Socket socket;
    public Echoer(Socket socket) {
        this.socket = socket;
    }

    public static void sleep(int milliseconds) {
        try {

            Thread.sleep(milliseconds);

        } catch (InterruptedException e) {
            System.out.println("Error creating sleep " +e.getMessage());
            e.printStackTrace();
        }
    }
    @Override
    public void run() {

        try
        {
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                String echoString = input.readLine();
                sleep(3000);
                System.out.println("Received Client input " +echoString);
                if (echoString.equals("exit")) {
                    break;
                }

                output.println(echoString);
            }
        } catch (IOException e) {
            System.out.println("Opps " +e.getMessage());
        } finally {
            try
            {
                System.out.println("Client Disconnected: " +socket.getRemoteSocketAddress());
                socket.close();

            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
