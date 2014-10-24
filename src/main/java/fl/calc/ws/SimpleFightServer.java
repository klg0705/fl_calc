package fl.calc.ws;

import javax.xml.ws.Endpoint;

public class SimpleFightServer {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8015/service/fight", new FightServiceImpl());
    }

}
