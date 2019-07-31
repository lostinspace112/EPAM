import functions.primeNumber;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberTests {
    private int PRIME_NUMBER;
    private int EVEN_NUMBER;

    public PrimeNumberTests() {
        try (Scanner scanner = new Scanner(new File("src/main/resources/TestDataPrimeNumber.txt"))) {
            while (scanner.hasNext()) {
                PRIME_NUMBER = scanner.nextInt();
                EVEN_NUMBER = scanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    @Test
    public void testPrimeNumber() {
        final primeNumber primeNumber = new primeNumber();
        assertTrue(primeNumber.isPrime(PRIME_NUMBER));
        System.out.println("input: " + PRIME_NUMBER);
        System.out.println("output: " + primeNumber.isPrime(PRIME_NUMBER));
    }

    @Test
    public void testEvenNumber() {
        final primeNumber primeNumber = new primeNumber();
        System.out.println("input: " + EVEN_NUMBER);
        assertFalse(primeNumber.isPrime(EVEN_NUMBER));
        System.out.println("output: " + primeNumber.isPrime(EVEN_NUMBER));
    }
}
