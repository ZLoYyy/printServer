package ru.TRPO.lesson_4;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by ((ZLoY)) on 22.11.2016.
 */
class Viewer implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        Printers printers = new Printers();
        String view = printers.get();

        byte[] bytes = view.getBytes();
        httpExchange.sendResponseHeaders(200, bytes.length);

        OutputStream os = httpExchange.getResponseBody();
        os.write(bytes);
        os.close();
    }
}
