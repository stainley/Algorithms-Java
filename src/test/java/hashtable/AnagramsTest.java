package hashtable;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Stainley Lebron
 * @since 7/11/20.
 */
public class AnagramsTest {

    @Test
    public void testSherlockAndAnagrams() {
        String st1 = "abba";
        String st2 = "abcd";

        int expectedValue1 = 4;
        int expectedValue2 = 0;

        Assert.assertEquals(expectedValue1, new Anagrams().sherlockAndAnagrams(st1));
        Assert.assertEquals(expectedValue2, new Anagrams().sherlockAndAnagrams(st2));
    }
}
