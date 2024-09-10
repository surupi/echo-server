package org.example;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EchoServerApplication {
    @Parameter(names = {"--port", "-p"})
    private int port = 1234;

    public static void main(String[] args) {
        EchoServerApplication app = new EchoServerApplication();
        JCommander commander = JCommander.newBuilder()
                .addObject(app)
                .build();

        commander.parse(args);
        app.run();
    }

    private void run() {
        EchoServer server = new EchoServer(this.port);
        server.start();
    }
}