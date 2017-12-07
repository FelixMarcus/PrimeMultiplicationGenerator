package millne.felix.primes;

import millne.felix.primes.PrimeGenerator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntBinaryOperator;

import static org.junit.Assert.assertEquals;

/**
 * Created by FelixMarcus on 07/12/2017.
 */
public class TestPrimeGenerator {

    @Test
    public void testZeroPrimes(){
        int testNumPrimes = 0;
        PrimeGenerator testPrimeGenerator = new PrimeGenerator();
        List<Integer> primesResult = testPrimeGenerator.getPrimes(testNumPrimes);
        assertEquals(0, primesResult.size());
    }

    @Test
    public void testOnePrimes() {
        int testNumPrimes = 1;
        PrimeGenerator testPrimeGenerator = new PrimeGenerator();
        List<Integer> primesResult = testPrimeGenerator.getPrimes(testNumPrimes);

        assertEquals(1, primesResult.size());
        Integer firstPrime = 2;
        assertEquals(firstPrime, primesResult.get(0));
    }

    @Test
    public void testTwoPrimes(){
        int testNumPrimes = 2;
        PrimeGenerator testPrimeGenerator = new PrimeGenerator();
        List<Integer> primesResult = testPrimeGenerator.getPrimes(testNumPrimes);

        assertEquals(testNumPrimes, primesResult.size());
        Integer firstPrime = 2;
        assertEquals(firstPrime, primesResult.get(0));

        Integer secondPrime = 3;
        assertEquals(secondPrime, primesResult.get(1));
    }
}
