import functions.SecondLongestCharacterChain;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static junit.framework.TestCase.*;

public class SecondLongestCharacterChainTests {

    private String INPUT, i;
    private int OUTPUT, n;
    private static final String INPUT_106_CHARACTERS = "cccccaeeeeebbaaaaeecccccaeeeeebbaaaaeecccccaeeeeebbaaaaeecccccaeeeeebbaaaaeecccccaeeeeebbaaaaeecccccaeeeeebbaaaaee";
    private static final String INPUT_NULL = null;

    public SecondLongestCharacterChainTests() {

        Map<String, Integer> ranges = new HashMap();
        try (Scanner scanner = new Scanner(new File("src/main/resources/TestDataCaracterChain.txt"))) {
            while (scanner.hasNext()) {
                INPUT = scanner.next();
                OUTPUT = scanner.nextInt();
                ranges.put(INPUT, OUTPUT);
            }
            System.out.println(ranges);
            ranges.forEach((key, value) -> {
                i = key;
                n = value;
                System.out.print("key: " + key);
                System.out.println(", Value: " + value);
            });
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testSecondLongestCharacterChainExampleA() {

        final SecondLongestCharacterChain secondLongestCharacterChain = new SecondLongestCharacterChain();
        final int result = secondLongestCharacterChain.characterChecker(INPUT);
        System.out.println("input: " + INPUT);
        System.out.println("output: " + result);
        assertEquals(result, OUTPUT);
    }

    @Test
    public void testNullCharacterChain() {
        final SecondLongestCharacterChain secondLongestCharacterChain = new SecondLongestCharacterChain();
        final int result = secondLongestCharacterChain.characterChecker(INPUT);
        System.out.println(result);
        assertEquals(0, INPUT_NULL);
    }

    @Test
    public void testBiggestCharacterChain() {
        final SecondLongestCharacterChain secondLongestCharacterChain = new SecondLongestCharacterChain();
        thrown.expect(RuntimeException.class);
        thrown.expectMessage("string length must be less then 106 characters");
        secondLongestCharacterChain.characterChecker(INPUT_106_CHARACTERS);
    }
}
