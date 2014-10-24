package fl.calc.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface="fl.calc.ws.Echo", serviceName = "Repeater")
public class EchoImpl implements Echo {

    @WebMethod(operationName = "repeat")
    public String echo(@WebParam(name = "origin") String s) {
        return ">" + s;
    }

    @WebMethod(exclude = true)
    public int howManyMonkeys(String s) {
        return s.length();
    }

    @WebMethod(exclude = true)
    public String secret(String s) {
        return "Tito has three balls";
    }
}
