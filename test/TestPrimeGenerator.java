import millne.felix.primes.PrimeGenerator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by FelixMarcus on 07/12/2017.
 */
public class TestPrimeGenerator {

    @Test
    public void testZeroPrimes(){
        int testNumPrimes = 0;
        PrimeGenerator testPrimeGenerator = new PrimeGenerator();
        ArrayList<Integer> primesResult = testPrimeGenerator.getPrimes(testNumPrimes);
        Assert.assertEquals(0, primesResult.size());
    }
}
