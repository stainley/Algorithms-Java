package sorting;

/**
 * @author Stainley Lebron
 * @since 5/6/20.
 */
public class BurbbleSort {

    public int[] sort(int[] array) {

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]){
                    swap(array, j, j + 1);
                }
            }
        }

        return array;
    }

    private static void swap(int[] array, int i, int j) {
        if(i == j)
            return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
