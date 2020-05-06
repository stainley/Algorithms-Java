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
public class FibonacciTest {

    @Test
    public void testFib() {
        Fibonacci fib = new Fibonacci();
        Assert.assertEquals(63245986, fib.calculateFib(40));
    }

    @Test
    public void testFib2() {
        Fibonacci fib = new Fibonacci();
        Assert.assertEquals(63245986, fib.calculateFib2(40));
    }

    @Test
    public void testFib3() {
        Fibonacci fib = new Fibonacci();
        Assert.assertEquals(63245986, fib.calculateFib3(40));
    }

}
