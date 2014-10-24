package fl.calc.ws;

import javax.xml.ws.Endpoint;

public class SimpleEchoServer {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8014/service/echo", new EchoImpl());
    }

}
