package millne.felix.primes;

import org.junit.Test;

import java.util.List;

/**
 * Created by FelixMarcus on 07/12/2017.
 */
public class TestErastothenesPrimeGeneratorPerformance {

    @Test
    public void testRudimentaryExponentialPerformance(){

        ErastothenesPrimeGenerator testGenerator = new ErastothenesPrimeGenerator();
        int exponential = 1;
        for(int i = 0; i < 7; i++){
            long startTime = System.nanoTime();
            List<Integer> result = testGenerator.getPrimes(exponential);
            long endTime = System.nanoTime();

            boolean isCorrect = result.size() == exponential;

            System.out.println(String.format("For %d primes, it took %d ns. It is %b.", exponential, endTime - startTime, isCorrect? "Correct": "Incorrect"));

            exponential *= 10;
        }
    }
}
