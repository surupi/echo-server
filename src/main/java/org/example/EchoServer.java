package org.example;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

@Getter
@Setter
@AllArgsConstructor
@Slf4j
public class EchoServer {
    private int port;
    public void start() {

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            log.info("Starting EchoServer on port {}", port);
            Socket clientSocket = serverSocket.accept();
            //code stops at this point and listens for a connection, if message comes from a required port, then we go in to the next line and connection is stopped
            log.info("Client connected");
        }catch(IOException e){
            log.error(e.getMessage());
        }
    }
}
