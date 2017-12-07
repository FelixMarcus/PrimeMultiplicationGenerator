package millne.felix.primes;

import org.junit.Test;

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
}
