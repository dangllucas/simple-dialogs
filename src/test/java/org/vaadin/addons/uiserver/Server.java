package org.vaadin.addons.uiserver;

import org.vaadin.addonhelpers.TServer;

/**
 * The main method in this helper class opens a web server to
 * http://localhost:9998/ to serve all your test UIs for development and
 * integration testing.
 */
public class Server extends TServer {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws Exception the exception
     */
    public static void main(String... args) throws Exception {
        new Server().startServer();
    }

}
