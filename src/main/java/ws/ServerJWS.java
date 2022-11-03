package ws;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {

    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9898/",new BanqueService());
        System.out.println("WEB service deploye sur http://0.0.0.0:9898/");
    }
}
