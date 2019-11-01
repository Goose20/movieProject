package com.learncode.movieserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sjoosthuizen
 */
public class Server {
    
    private ServerSocket serverSocket;
    private Socket acceptSocket;
    
    
    public static void main(String[] args) {
        new ServerForm().setVisible(true);
    }
    
    public void run() {
        try {
            serverSocket = new ServerSocket(7890);
            acceptSocket = serverSocket.accept();
            
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
