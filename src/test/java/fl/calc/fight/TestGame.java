package fl.calc.fight;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fl.core.domain.Fighter;

public class TestGame {

    @Test
    public final void testFight() {
        Fighter a = new Fighter();
        a.setAttack(10);
        a.setDefence(10);
        a.setHp(50);
        Fighter b = new Fighter();
        b.setAttack(16);
        b.setDefence(20);
        b.setHp(40);
        
        Game game = new Game();
        game.fight(a, b);
        
        assertEquals(-4, a.getHp());
        assertEquals(31, b.getHp());
    }

}
