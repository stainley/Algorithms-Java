package sorting;

/**
 * @author Stainley Lebron
 * @since 5/10/20.
 */
public class ShellSort {

    public int[] sort(int[] array) {

        for(int gap = array.length / 2; gap > 0;  gap /= 2) {

            for(int i = gap; i < array.length; i++) {
                int newElement = array[i];

                int j = i;
                while(j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j = j - gap;
                }

                array[j] = newElement;
            }
        }

        return array;
    }
}
