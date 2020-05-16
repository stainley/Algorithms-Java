package sorting;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Stainley Lebron
 * @since 5/5/20.
 */
public class InsertionSortTest {

    @Test
    public void testInsertionSort(){
        int[] array = {8, 5, 2, 9, 5, 6, 3};
        int[] expectedValue = {2, 3, 5, 5, 6, 8, 9};

        Assert.assertArrayEquals(expectedValue, new InsertionSort().sort(array));
    }
}
