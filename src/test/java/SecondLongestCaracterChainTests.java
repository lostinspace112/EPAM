import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


import static junit.framework.TestCase.*;

public class SecondLongestCaracterChainTests {

    String inputA = "aabbbcwwww";
    String inputB = "cccccaeeeeebbaaaaee";
    String input106caracters = "cccccaeeeeebbaaaaeecccccaeeeeebbaaaaeecccccaeeeeebbaaaaeecccccaeeeeebbaaaaeecccccaeeeeebbaaaaeecccccaeeeeebbaaaaee";
    String inputNull = null;
    int outputA = 3;
    int outputB = 4;


    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void testSecondLongestCaracterChainExampleA() {
        final functions.SecondLongestCaracterChain secondLongestCaracterChain = new functions.SecondLongestCaracterChain();
        final int result = secondLongestCaracterChain.caracterChecker(inputA);
        System.out.println("input: " + inputA);
        System.out.println("output: " + result);
        assertEquals(result,outputA);
    }

    @Test
    public void testSecondLongestCaracterChainExampleB() {
        final functions.SecondLongestCaracterChain secondLongestCaracterChain = new functions.SecondLongestCaracterChain();
        final int result = secondLongestCaracterChain.caracterChecker(inputB);
        System.out.println("input: " + inputB);
        System.out.println("output: " + result);
        assertEquals(result,outputB);
    }

    @Test
    public void testNullCaracterChain() {
        final functions.SecondLongestCaracterChain secondLongestCaracterChain = new functions.SecondLongestCaracterChain();
        final int result = secondLongestCaracterChain.caracterChecker(inputNull);
        System.out.println(result);
        assertNotNull(result);
    }

    @Test
    public void testbiggestCaracterChain() {
        final functions.SecondLongestCaracterChain secondLongestCaracterChain = new functions.SecondLongestCaracterChain();
        thrown.expect(RuntimeException.class);
        thrown.expectMessage("string length must be less then 106 characters");
        secondLongestCaracterChain.caracterChecker(input106caracters);
    }
}
