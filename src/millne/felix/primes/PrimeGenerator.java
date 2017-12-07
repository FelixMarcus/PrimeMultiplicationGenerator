package millne.felix.primes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by FelixMarcus on 07/12/2017.
 */
public class PrimeGenerator {
    public List<Integer> getPrimes(int numPrimes) {
        if(numPrimes == 0)
        return new ArrayList<Integer>();

        List<Integer> resultsArray = new ArrayList<>();
        resultsArray.add(2);

        if(numPrimes > 1){
            resultsArray.add(3);
        }

        return resultsArray;
    }
}
