package sorting;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Stainley Lebron
 * @since 5/15/20.
 */
public class QuickSortTest {


    @Test
    public void testQuickSort(){
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        int[] expectedValue = {-22, -15, 1, 7, 20, 35, 55};

        Assert.assertArrayEquals(expectedValue, new QuickSort().sort(array));
    }
}
