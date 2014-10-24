package fl.calc.ws;

import java.util.List;

import javax.jws.WebService;

import fl.calc.fight.Game;
import fl.core.domain.Fighter;

@WebService(endpointInterface = "fl.calc.ws.FightService")
public class FightServiceImpl implements FightService {

    public List<Fighter> fight(List<Fighter> fighters) {
        Game game = new Game();
        game.fight(fighters.get(0), fighters.get(1));
        return fighters;
    }
}
