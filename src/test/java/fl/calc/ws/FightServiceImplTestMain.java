package fl.calc.ws;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import fl.core.domain.Fighter;

public class FightServiceImplTestMain {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:9015/service/fight?wsdl");
        // URL url = new URL("http://localhost:8015/service/fight?wsdl");
        QName qName = new QName("http://ws.calc.fl/", "FightServiceImplService");
        Service service = Service.create(url, qName);
        FightService port = service.getPort(FightService.class);

        List<Fighter> list = new ArrayList<Fighter>();
        Fighter a = new Fighter();
        a.setAttack(10);
        a.setDefence(10);
        a.setHp(50);
        list.add(a);
        Fighter b = new Fighter();
        b.setAttack(16);
        b.setDefence(20);
        b.setHp(40);
        list.add(b);

        list = port.fight(list);
    }

}
