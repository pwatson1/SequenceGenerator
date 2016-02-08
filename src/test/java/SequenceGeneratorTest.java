import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pwatson on 2/8/16.
 */
public class SequenceGeneratorTest {
    SequenceGenerator sG;

    @Before
    public void setUp() throws Exception {
        sG = new SequenceGenerator();

    }

    @Test
    public void testPrintNumbers() {
        assertTrue("Expect numbers between 1 and 26", sG.printNumbers(1,26) != null );

    }

    @Test
    public void testPrintAlphabet() {
        assertTrue("PrintAlphabet will return a letter between A - Z", sG.printAlphabet('a','z') != null );

    }

    @Test
    public void testPrintOddNumbers() {
        assertTrue("Expect an odd number", sG.printOddNumbers(1, 25) != null);
    }
}