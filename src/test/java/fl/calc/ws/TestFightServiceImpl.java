package fl.calc.ws;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fl.core.domain.Fighter;

public class TestFightServiceImpl {

    @Test
    public final void test() {
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

        FightServiceImpl service = new FightServiceImpl();
        list = service.fight(list);
        assertEquals(-4, list.get(0).getHp());
        assertEquals(31, list.get(1).getHp());
    }

}
