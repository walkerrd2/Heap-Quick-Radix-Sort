
/**
 * Our Heap sort class will hold 2 functions: Heapify which
 *  * will be a void method. And our sort method that will sort
 *  * an array of integers. The class will also implement the
 *  * interface ArrayPrint and give use the method to print the
 *  * arrays.
 */

public class HeapSort implements ArrayPrint {

    // This method will be used to turn the
    // passed array into a heap
    public void heapify(int[] array, int size, int i){

        int large = i; // initialize the largest are the root
        int left = (2*large)+1;
        int right = (2*large)+2;

        // if left number is larger than root
        if(left < size && array[left] > array[large]){
            large = left;
        }
        // if right number is larger than the large
        if(right < size && array[right] > array[large]){
            large = right;
        }
        // if large is not root
        if(large != i){
            int swap = array[i];
            array[i] = array[large];
            array[large] = swap;

            // recursively heapify
            heapify(array,size,large);
        }
    }

    // This method will sort the array via Heap sort
    public int[] heapSort(int[] array){
        //Build the heap
        for(int i = array.length/2 - 1; i>=0; i--){
            heapify(array, array.length, i);
        }
        // Extract element from heap
        for(int i = array.length-1; i >= 0; i--){
            // Move current root to the end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // call max heapify
            heapify(array, i, 0);
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
