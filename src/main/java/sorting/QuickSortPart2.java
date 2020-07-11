package sorting;

/**
 * @author Stainley Lebron
 * @since 5/18/20.
 */
public class QuickSortPart2 {

    public static void main(String[] args) {
        int[] ar = {5, 8, 1, 3, 7, 9, 2};

        quickSort(ar);
    }

    private static void quickSort(int[] ar) {
        int n = ar.length;
        if (n < 2) return;

        int[] leftArray = ar;

        int pivot = ar[0];
        int left = 1;
        int right = n - 1;

        while (left < right) {

            while (left < right && ar[++left] <= pivot) ;
            if (left < right) {
                leftArray[left] = ar[right];
                System.out.println(leftArray[left]);
            }

            while (left < right && ar[--right] >= pivot) ;
            if ((left < right)) {
                System.out.println(leftArray[right]);
            }
        }


    }
}
