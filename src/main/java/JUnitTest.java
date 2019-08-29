import org.junit.Assert;
import org.junit.Test;

public class JUnitTest {

    /**
     * **** Tests findMin function. *****
     */
    //Tests a normal array to find the minimum number.
    @Test public void minNormal1() {
        int[] a = {2, 8, 7, 3, 4};
        Integer expected = 2;
        Assert.assertEquals(expected, Finder.findMin(a));
    }

    //Tests an array that is equals to null to see if it returns back null.
    @Test public void minNull() {
        int[] a = null;
        Integer expected = null;
        Assert.assertEquals(expected, Finder.findMin(a));
    }

    // Tests an array with all duplicates of zeroes to find the minimum number.
    @Test public void minEmpty() {
        int[] a = {};
        Integer expected = null;
        Assert.assertEquals(expected, Finder.findMin(a));
    }


    /**
     * **** Tests findMax function. *****
     */
    // Tests a normal array to find the max number.
    @Test public void maxNormal() {
        int[] b = {2, 8, 7, 3, 4};
        Integer expected = 8;
        Assert.assertEquals(expected, Finder.findMax(b));
    }

    //Tests an array that is equals to null to see if it returns back null.
    @Test public void maxNull() {
        int[] b = null;
        Integer expected = null;
        Assert.assertEquals(expected, Finder.findMax(b));
    }

    // Tests an array with all negative numbers to find the maximum number.
    @Test public void maxEmpty() {
        int[] b = {};
        Integer expected = null;
        Assert.assertEquals(expected, Finder.findMax(b));
    }


}
