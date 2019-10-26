package ro.ubbcluj.tool;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class KisteTest {

    private Kiste kiste = new Kiste();
    private List<Tool> input;
    private Tool hammer;
    private Tool sagen;
    private Tool schere;
    private Tool nagel;

    @Before
    public void setUp() {
        nagel = new Nagel();
        sagen = new Sagen();
        schere = new Schere();
        hammer = new Hammer();
        input = List.of(nagel, sagen, schere, hammer);
    }

    @Test
    public void gewicht() {
        List<Tool> result = kiste.gewichtGroeserAls5(input);

        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.contains(hammer));
    }

    @Test
    public void canCut() {
        List<Tool> result = kiste.kannSchneiden(input);

        assertEquals(2, result.size());
        assertTrue(result.contains(sagen));
        assertTrue(result.contains(schere));
    }

}
