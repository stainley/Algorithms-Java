package array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * @author Stainley Lebron
 * @since 12/3/19.
 */

@RunWith(JUnit4.class)
public class TwoNumSumTest {

    @Test
    public void twoNumberSum () {
        TwoNumSum numSum = new TwoNumSum();
        int[] array = {3, 5, -4, 8, 11, 1, -1, -6};
        int[] expected = {11, -1};
        int[] result = numSum.twoNumberSum(array, 10);
        Assert.assertEquals(expected[0], result[0]);
        Assert.assertEquals(expected[1], result[1]);
    }

    @Test
    public void twoNumberSum2 () {
        TwoNumSum numSum = new TwoNumSum();
        int[] array = {3, 5, -4, 8, 11, 1, -1, -6};
        int[] expected = {11, -1};
        int[] result = numSum.twoNumberSum2(array, 10);
        Assert.assertEquals(expected[0], result[0]);
        Assert.assertEquals(expected[1], result[1]);
    }

    @Test
    public void twoNumberSum3 () {
        TwoNumSum numSum = new TwoNumSum();
        int[] array = {3, 5, -4, 8, 11, 1, -1, -6};
        int[] expected = {11, -1};
        int[] result = numSum.twoNumberSum3(array, 10);
        Assert.assertEquals(expected[0], result[0]);
        Assert.assertEquals(expected[1], result[1]);
    }

}
