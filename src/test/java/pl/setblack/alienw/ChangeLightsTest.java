package pl.setblack.alienw;

import org.junit.Ignore;
import org.junit.Test;

import java.awt.*;

@Ignore
public class ChangeLightsTest {

    @Test
    public void testLights() {
        final AlienBridge alien = new AlienBridge();
        alien.setColors(AlienSourceDefinifion.ALL.getSource(), Color.BLUE);
        sleep();
        alien.setColors(AlienSourceDefinifion.ALL.getSource(), Color.RED);
        sleep();
        alien.setColors(AlienSourceDefinifion.ALL.getSource(), Color.YELLOW);
        sleep();
        alien.release();
    }


    private static void sleep() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
