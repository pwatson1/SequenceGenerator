import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pwatson on 2/8/16.
 */
public class SequenceGeneratorTest {
    SequenceGenerator sequenceGenerator;

    @Before//What does this area of the test do?
    public void setUp(){
        sequenceGenerator= new SequenceGenerator();

    }
    @Test
    public void testPrintNumbers() /*throws Exception*/{
        /*Tests that an integer is returned...*/
        String expected  = "1 2 3 4 5 6 7 8 9 10 ";
        String actual = sequenceGenerator.printNumbers(1,10);
        assertEquals("String is not a character between 1 and 10", expected,actual);
        //Prints message when test fails, because we set 0

    }

    @Test
    public void testPrintAlphabet() /*throws Exception*/  {
        String expected = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z ";
        String actual = sequenceGenerator.printAlphabet('A','Z');
        assertEquals("Letter between A-Z returned", expected, actual);
        //assertNotNull("Letter between A-Z returned", sequenceGenerator.printAlphabet('A','Z'));
        //Fail: Because we are asking it to print null Line : 18. We ask
    }

    @Test
    public void testPrintOddNumbers() /*throws Exception*/ {
        String expected  = "1 3 5 7 9 ";
        String actual = sequenceGenerator.printOddNumbers(1,10);
        assertEquals("No odd integers returned", expected, actual);
    }
}
