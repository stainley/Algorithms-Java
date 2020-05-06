package sorting;

/**
 * @author Stainley Lebron
 * @since 5/5/20.
 */
public class SelectionSort {

    public int[] sort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            int smallest = i;

            for(int j = i; j < array.length; j++) {
                if(array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            swap(array, i, smallest);
        }
        return array;
    }

    private static void swap(int[] array, int i, int smallest) {
        int temp = array[i];
        array[i] = array[smallest];
        array[smallest] = temp;
    }
}
