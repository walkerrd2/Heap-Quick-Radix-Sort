import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("***HEAP SORT***");
        int[] heapSortArray = new int[6];
        heapSortArray[0] = 23;
        heapSortArray[1] = 93;
        heapSortArray[2] = 52;
        heapSortArray[3] = 12;
        heapSortArray[4] = 41;
        heapSortArray[5] = 96;

        HeapSort hs = new HeapSort();
        System.out.println("Unsorted list:");
        hs.print(heapSortArray);

        hs.heapSort(heapSortArray);
        System.out.println("\nSorted list:");
        hs.print(heapSortArray);

        System.out.println("\n----------------------");

        System.out.println("***RANDOMIZED QUICK SORT***");
        // Adding random integers to the array to make it more randomized
        int[] quickSortArray = new int[8];
        quickSortArray[0] = random.nextInt(501);
        quickSortArray[1] = random.nextInt(501);
        quickSortArray[2] = random.nextInt(501);
        quickSortArray[3] = random.nextInt(501);
        quickSortArray[4] = random.nextInt(501);
        quickSortArray[5] = random.nextInt(501);
        quickSortArray[6] = random.nextInt(501);
        quickSortArray[7] = random.nextInt(501);

        RandomizedQuickSort rqs = new RandomizedQuickSort();
        System.out.println("Unsorted list:");
        rqs.print(quickSortArray);

        rqs.quickSort(quickSortArray, 0, quickSortArray.length-1);
        System.out.println("\nSorted list:");
        rqs.print(quickSortArray);

        System.out.println("\n----------------------");

        System.out.println("***RADIX SORT***");
        int[] radixSortArray = new int[11];
        radixSortArray[0] = 418;
        radixSortArray[1] = 715;
        radixSortArray[2] = 483;
        radixSortArray[3] = 526;
        radixSortArray[4] = 374;
        radixSortArray[5] = 648;
        radixSortArray[6] = 279;
        radixSortArray[7] = 323;
        radixSortArray[8] = 404;
        radixSortArray[9] = 226;
        radixSortArray[10] = 939;

        RadixSort rs = new RadixSort();
        System.out.println("Unsorted list:");
        rs.print(radixSortArray);

        rs.radixSort(radixSortArray);
        System.out.println("\nSorted list:");
        rs.print(radixSortArray);

    }
}