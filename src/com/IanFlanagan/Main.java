package com.IanFlanagan;

import java.io.*;
import java.net.ServerSocket;

public class Main {

    public static final int myPort = 5000;

    public static void main(String[] args) {

        try(ServerSocket serverSocket = new ServerSocket(myPort)) {

            while(true) {

                new Echoer(serverSocket.accept()).start();

            }

        } catch (IOException e) {
            System.out.println("Server Exception" +e.getMessage());
        }
    }
}
