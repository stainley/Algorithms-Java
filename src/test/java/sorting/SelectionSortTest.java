package sorting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Stainley Lebron
 * @since 5/5/20.
 */
public class SelectionSortTest {

    @Test
    public void testSelectSort(){
        int[] array = {8, 5, 2, 9, 5, 6, 3};
        int[] expectedValue = {2, 3, 5, 5, 6, 8, 9};

        Assert.assertArrayEquals(expectedValue, new SelectionSort().sort(array));
    }
}
