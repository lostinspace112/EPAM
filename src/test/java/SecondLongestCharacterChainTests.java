import functions.SecondLongestCharacterChain;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


import static junit.framework.TestCase.*;

public class SecondLongestCharacterChainTests {

    private static final String INPUT_A = "aabbbcwwww";
    private static final String INPUT_B = "cccccaeeeeebbaaaaee";
    private static final String INPUT_106_CHARACTERS = "cccccaeeeeebbaaaaeecccccaeeeeebbaaaaeecccccaeeeeebbaaaaeecccccaeeeeebbaaaaeecccccaeeeeebbaaaaeecccccaeeeeebbaaaaee";
    private static final String INPUT_NULL = null;
    private static final int OUTPUT_A = 3;
    private static final int OUTPUT_B = 4;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testSecondLongestCharacterChainExampleA() {
        final SecondLongestCharacterChain secondLongestCharacterChain = new SecondLongestCharacterChain();
        final int result = secondLongestCharacterChain.characterChecker(INPUT_A);
        System.out.println("input: " + INPUT_A);
        System.out.println("output: " + result);
        assertEquals(result, OUTPUT_A);
    }

    @Test
    public void testSecondLongestCharacterChainExampleB() {
        final SecondLongestCharacterChain secondLongestCharacterChain = new SecondLongestCharacterChain();
        final int result = secondLongestCharacterChain.characterChecker(INPUT_B);
        System.out.println("input: " + INPUT_B);
        System.out.println("output: " + result);
        assertEquals(result, OUTPUT_B);
    }

    @Test
    public void testNullCharacterChain() {
        final SecondLongestCharacterChain secondLongestCharacterChain = new SecondLongestCharacterChain();
        final int result = secondLongestCharacterChain.characterChecker(INPUT_NULL);
        System.out.println(result);
        assertEquals(0, result);
    }

    @Test
    public void testBiggestCharacterChain() {
        final SecondLongestCharacterChain secondLongestCharacterChain = new SecondLongestCharacterChain();
        thrown.expect(RuntimeException.class);
        thrown.expectMessage("string length must be less then 106 characters");
        secondLongestCharacterChain.characterChecker(INPUT_106_CHARACTERS);
    }
}
