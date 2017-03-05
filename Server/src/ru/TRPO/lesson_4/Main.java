package ru.TRPO.lesson_4;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {

    public static void main(String[] args) throws IOException {
        int port = 8765;

        HttpServer server = HttpServer.create();
        server.bind(new InetSocketAddress(port), 0);

        server.createContext("/", new Viewer());
        server.start();

        System.out.println("Server started localhost:" + port);
    }


}
