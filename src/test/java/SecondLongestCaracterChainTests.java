import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SecondLongestCaracterChainTests {

    String inputA = "aabbbcwwww";
    String inputB = "cccccaeeeeebbaaaaee";
    int outputA = 3;
    int outputB = 4;

    @Test
    public void testSecondLongestCaracterChainExampleA() {
        final functions.SecondLongestCaracterChain secondLongestCaracterChain = new functions.SecondLongestCaracterChain();
        final int result = secondLongestCaracterChain.caracterChecker(inputA);
        System.out.println(result);
        assertEquals(result,outputA);
    }

    @Test
    public void testSecondLongestCaracterChainExampleB() {
        final functions.SecondLongestCaracterChain secondLongestCaracterChain = new functions.SecondLongestCaracterChain();
        final int result = secondLongestCaracterChain.caracterChecker(inputB);
        System.out.println(result);
        assertEquals(result,outputB);
    }
}
