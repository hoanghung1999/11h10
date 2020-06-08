package server;

import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class HttpServer {
    public static Server server;
    private static void runJerseyNetty_server(){
        ResourceConfig rc= new ResourceConfig().packages("api");
        URI uri= UriBuilder.fromUri("http://localhost/").port(1234).build();
        server= JettyHttpContainerFactory.createServer(uri,rc);
        try {
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        runJerseyNetty_server();
    }
}
