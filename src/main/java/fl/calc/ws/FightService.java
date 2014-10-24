package fl.calc.ws;

import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import fl.core.domain.Fighter;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface FightService {

    List<Fighter> fight(List<Fighter> fighters);
}
