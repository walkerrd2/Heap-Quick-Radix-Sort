import java.util.Arrays;

/**
 * This class will implement 2 helper methods:
 * getMax() and count() in order to execute the
 * Radix Sorting method.
 */

public class RadixSort implements ArrayPrint {

    // Helper method to get maximum value from the array
    public int getMax(int[] array){
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    // Helper method to do counting sorting of given array
    // according to the digit represented by exponent, exp
    public void count(int[] array, int exp){
        int[] output = new int[array.length]; // output array
        int[] count = new int[10];
        Arrays.fill(count,0);

        // storing count of occurrences in count[]
        for(int i = 0; i < array.length; i++){
            count[(array[i] / exp) % 10]++;
        }

        // Change count[i] so that it contains
        // actual position of digit in output[]
        for(int i = 1; i < 10; i++){
            count[i]+=count[i-1];
        }

        // Loop will build the output array
        for(int i = array.length - 1; i >= 0; i--){
            output[count[(array[i] / exp)%10]-1] = array[i];
            count[(array[i] / exp)%10]--;
        }

        // Copy output array to array[] so that it will
        // contain sorted numbers according to current digit
        for(int i = 0; i < array.length; i++){
            array[i] = output[i];
        }
    }

    // This is the main method that will execute the sorting
    public int[] radixSort(int[] array){
        int max = getMax(array);

        // Counting sort for every digit.
        // Exp is passed as 10^i where i
        // is the current digit
        for(int exp = 1; max/exp > 0; exp*=10){
            count(array,exp);
        }
        return array;
    }

    @Override
    public void print(int[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
