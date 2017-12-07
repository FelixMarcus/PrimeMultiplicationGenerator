package millne.felix.primes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by FelixMarcus on 07/12/2017.
 */
public class ErastothenesPrimeGenerator {
    public List<Integer> getPrimes(int numberOfPrimesToBeFound) {
        if(numberOfPrimesToBeFound == 0)
        return new ArrayList<Integer>();

        List<Integer> foundPrimes = new ArrayList<>(numberOfPrimesToBeFound);
        foundPrimes.add(2);

        int numberBeingChecked = 3;
        while(foundPrimes.size() < numberOfPrimesToBeFound){
            if(isPrime(foundPrimes, numberBeingChecked)){
                foundPrimes.add(numberBeingChecked);
            }
            numberBeingChecked += 2; //Only check odd numbers
        }

        return foundPrimes;
    }

    private boolean isPrime(List<Integer> foundPrimes, int numberBeingChecked) {
        boolean isPrime = true;
        for(Integer knownPrime: foundPrimes){
            if(isAFactor(numberBeingChecked, knownPrime)){
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    private boolean isAFactor(int numberBeingChecked, Integer knownPrime) {
        return numberBeingChecked % knownPrime == 0;
    }
}
