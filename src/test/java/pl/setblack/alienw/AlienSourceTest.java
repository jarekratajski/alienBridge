package pl.setblack.alienw;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kanap on 16.12.2016.
 */
public class AlienSourceTest {

    @Test
    public void exclusionOfSameShouldGiveZero() {
        final AlienSource orig = new AlienSource(AlienSourceDefinifion.ALL_LEFT);

        assertEquals(orig.without(orig).value, 0 );
    }

    @Test
    public void inclusionFromBlankSameShouldGiveGiven() {
        final AlienSource blank = new AlienSource(AlienSourceDefinifion.OFF);
        final AlienSource other = new AlienSource(AlienSourceDefinifion.ALL_LOWER);

        assertEquals(blank.with(other).value, AlienSourceDefinifion.ALL_LOWER.getCode() );
    }

    @Test
    public void exclusionOfAllRightShouldIncludeAllLeft() {
        final AlienSource all = new AlienSource(AlienSourceDefinifion.ALL);
        final AlienSource other = new AlienSource(AlienSourceDefinifion.ALL_RIGHT);

        assertEquals(all.without(other).value & AlienSourceDefinifion.ALL_LEFT.getCode(),AlienSourceDefinifion.ALL_LEFT.getCode() );
    }


}