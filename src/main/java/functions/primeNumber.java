package functions;

public class primeNumber {

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(Math.abs(n)); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
