package fl.calc.ws;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class EchoWSTestMain {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:9014/service/echo?wsdl");
        // URL url = new URL("http://localhost:8014/service/echo?wsdl");
        QName qName = new QName("http://ws.calc.fl/", "Repeater");
        Service service = Service.create(url, qName);
        Echo port = service.getPort(Echo.class);
        System.out.println(port.echo("Hello World!"));
    }
}
