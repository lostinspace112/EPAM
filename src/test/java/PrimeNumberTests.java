import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PrimeNumberTests {
    int n = 19;
    int m = 165468;

    @Test
    public void testPrimeNumber() {

        final functions.PrimeNumber primeNumber = new functions.PrimeNumber();
        assertTrue(primeNumber.isPrime(n));
        System.out.println(primeNumber.isPrime(n));

    }

    @Test
    public void testEvenNumber() {
        final functions.PrimeNumber primeNumber = new functions.PrimeNumber();
        assertFalse(primeNumber.isPrime(m));
        System.out.println(primeNumber.isPrime(m));

    }
}
