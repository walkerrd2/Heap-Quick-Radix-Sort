import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Junit {

    @Test
    public void heapTest(){
        int[] actual = {32,1,76,45,6};
        int[] expected = {1,6,32,45,76};
        HeapSort heap = new HeapSort();
        heap.heapSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void quickSortTest(){
        int[] act = {54,8,12,21,3,76,34,0};
        int[] expected = {0,3,8,12,21,34,54,76};
        RandomizedQuickSort qs = new RandomizedQuickSort();
        qs.quickSort(act,0,act.length-1);
        assertArrayEquals(expected,act);
    }

    @Test
    public void radixSortTest(){
        int[] act = {82,33,1,28,93,11,23};
        int[] expected = {1,11,23,28,33,82,93};
        RadixSort rs = new RadixSort();
        rs.radixSort(act);
        assertArrayEquals(expected,act);
    }





}
