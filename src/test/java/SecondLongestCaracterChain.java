import org.junit.Test;

import static functions.SecondLongestCaracterChain.getSecondMostFreq;

public class SecondLongestCaracterChain {

    @Test
    public void testSecondLongestCaracterChain() {

        String str = "aabbbcwwww";
        char res = getSecondMostFreq(str);
        if (res != '\0')
            System.out.println(res);
        else
            System.out.println("No second most frequent"+
                    "character");
    }

}
