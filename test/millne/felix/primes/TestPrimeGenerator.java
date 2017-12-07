package millne.felix.primes;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by FelixMarcus on 07/12/2017.
 */
public class TestPrimeGenerator {

    @Test
    public void testZeroPrimes(){
        int testNumPrimes = 0;
        ErastothenesPrimeGenerator testPrimeGenerator = new ErastothenesPrimeGenerator();
        List<Integer> primesResult = testPrimeGenerator.getPrimes(testNumPrimes);
        assertEquals(testNumPrimes, primesResult.size());
    }

    @Test
    public void testOnePrimes() {
        int testNumPrimes = 1;
        ErastothenesPrimeGenerator testPrimeGenerator = new ErastothenesPrimeGenerator();
        List<Integer> primesResult = testPrimeGenerator.getPrimes(testNumPrimes);

        assertEquals(testNumPrimes, primesResult.size());
        Integer firstPrime = 2;
        assertEquals(firstPrime, primesResult.get(0));
    }

    @Test
    public void testTwoPrimes(){
        int testNumPrimes = 2;
        ErastothenesPrimeGenerator testPrimeGenerator = new ErastothenesPrimeGenerator();
        List<Integer> primesResult = testPrimeGenerator.getPrimes(testNumPrimes);

        assertEquals(testNumPrimes, primesResult.size());
        Integer firstPrime = 2;
        assertEquals(firstPrime, primesResult.get(0));

        Integer secondPrime = 3;
        assertEquals(secondPrime, primesResult.get(1));
    }

    @Test
    public void testThreePrimes(){
        int testNumPrimes = 3;
        ErastothenesPrimeGenerator testPrimeGenerator = new ErastothenesPrimeGenerator();
        List<Integer> primesResult = testPrimeGenerator.getPrimes(testNumPrimes);

        assertEquals(testNumPrimes, primesResult.size());
        Integer firstPrime = 2;
        assertEquals(firstPrime, primesResult.get(0));

        Integer secondPrime = 3;
        assertEquals(secondPrime, primesResult.get(1));

        Integer thirdPrime = 5;
        assertEquals(thirdPrime, primesResult.get(2));
    }

    @Test
    public void testHundredPrimes() {
        int testNumPrimes = 100;
        ErastothenesPrimeGenerator testPrimeGenerator = new ErastothenesPrimeGenerator();
        List<Integer> primesResult = testPrimeGenerator.getPrimes(testNumPrimes);

        assertEquals(testNumPrimes, primesResult.size());
        List<Integer> controlPrimes = Arrays.asList(
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
                31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
                73, 79, 83, 89, 97, 101, 103, 107, 109,
                113, 127, 131, 137, 139, 149, 151, 157, 
                163, 167, 173, 179, 181, 191, 193, 197,
                199, 211, 223, 227, 229, 233, 239, 241,
                251, 257, 263, 269, 271, 277, 281, 283,
                293, 307, 311, 313, 317, 331, 337, 347,
                349, 353, 359, 367, 373, 379, 383, 389,
                397, 401, 409, 419, 421, 431, 433, 439,
                443, 449, 457, 461, 463, 467, 479, 487,
                491, 499, 503, 509, 521, 523, 541);
        assertEquals(controlPrimes, primesResult);
    }
}
