package tw.org.evenodd;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by stutis on 6/6/17.
 */
public class EvenOrOddTest {
    @Test
    public void shouldReturnTrueForEvenNumber(){
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        assertTrue(evenOrOdd.isEven(4));
    }
    @Test
    public void shouldPass(){
        assertTrue(true);
    }
}
