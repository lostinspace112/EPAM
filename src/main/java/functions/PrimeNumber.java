package functions;

import java.util.Scanner;

public class PrimeNumber{
    public PrimeNumber(Integer n){
        //Scanner s = new Scanner(System.in);
        //System.out.print("Enter a number : ");
        if (isPrime(n)) {
            System.out.println(n + "True");
        } else {
            System.out.println(n + "False");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

