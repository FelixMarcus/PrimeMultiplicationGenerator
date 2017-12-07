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
            if(numberHasNoLargerPossibleFactors(numberBeingChecked, knownPrime)){
                break;
            }

            if(isAFactor(numberBeingChecked, knownPrime)){
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    private boolean numberHasNoLargerPossibleFactors(int numberBeingChecked, Integer knownPrime) {
        //Number cannot have a factor of knownPrime if it is smaller than the square of known prime
        //(assuming all smaller primes have been checked)
        return numberBeingChecked < knownPrime * knownPrime;
    }

    private boolean isAFactor(int numberBeingChecked, Integer knownPrime) {
        return numberBeingChecked % knownPrime == 0;
    }
}
