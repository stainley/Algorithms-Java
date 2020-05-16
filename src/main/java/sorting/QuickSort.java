package sorting;

/**
 * @author Stainley Lebron
 * @since 5/15/20.
 */
public class QuickSort {

    public int[] sort(int[] array) {

        quicksort(array, 0, array.length);

        for(int x : array) {
            System.err.print(x  + "\t");
        }

        return array;
    }

    private static void quicksort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quicksort(input, start, pivotIndex);
        quicksort(input, pivotIndex + 1, end);
    }

    private static int partition(int[] input, int start, int end) {

        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            while (i < j && input[++i] <= pivot) ;
            if (i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }
}
