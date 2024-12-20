import java.util.Random;

/**
 * This class will hold the methods needed for
 * randomized quick sort. It will implement a random
 * helper method, a partition method, and the sort method.
 */
public class RandomizedQuickSort implements ArrayPrint {

    // This method is our random helper method
    public void random(int[] array, int low, int high){
        Random random = new Random();
        int pivot = random.nextInt(high-low)+low;

        int temp = array[pivot];
        array[pivot] = array[high];
        array[high] = temp;
    }

    // This method will take the last element as a pivot,
    // places it at its correct position in a sorted array,
    // and places all (smaller than pivot), to the left of
    // pivot and all greater elements to right.
    public int partition(int[] array, int low, int high){
        // pivot chosen at random
        random(array,low,high);
        int piv = array[high];

        int i = low-1; // index smaller element
        for(int j = low; j < high; j++){
            // if current element less than the pivot
            if(array[j] < piv){
                i++;
                // swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // swap array[i+1} and pivot
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        return i+1;
    }

    // This is the main method that will implement quick sort.
    // low is the starting index, high is the last index.
    public int[] quickSort(int[] array, int low, int high){
        if(low < high){
            int pi = partition(array,low,high); // pi represents partitioning index

            // recursively sort elements
            quickSort(array,low,pi-1);
            quickSort(array,pi+1,high);
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
