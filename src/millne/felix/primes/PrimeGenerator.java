package millne.felix.primes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by FelixMarcus on 07/12/2017.
 */
public class PrimeGenerator {
    public List<Integer> getPrimes(int testNumPrimes) {
        if(testNumPrimes == 0)
        return new ArrayList<Integer>();

        List<Integer> resultsArray = new ArrayList<>();
        resultsArray.add(2);
        return resultsArray;
    }
}
