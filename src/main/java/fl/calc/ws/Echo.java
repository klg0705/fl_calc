package fl.calc.ws;

import javax.jws.WebService;

@WebService
public interface Echo {

    String echo(String s);
    
    int howManyMonkeys(String s);
}
