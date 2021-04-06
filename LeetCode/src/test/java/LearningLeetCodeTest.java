import com.leetcode.learning.Fib;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import com.leetcode.learning.LearningLeetCode;

public class LearningLeetCodeTest {
    private LearningLeetCode myLeetCode;

    @Before
    public void init() {
        myLeetCode = new LearningLeetCode();
    }

    @Test
    public void singleNumberTest1 () {
        int[] numbers = {4, 1, 2, 1, 2};
        int result = myLeetCode.singleNumber(numbers);
        Assert.assertEquals(4, result);
    }

    @Test
    public void intersectTest1 () {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] expect = {2, 2};
        int[] result = myLeetCode.intersect(nums1, nums2);
        Assert.assertArrayEquals(expect, result);
    }
    @Test
    public void intersectTest2 () {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2};
        int[] expect = {2};
        int[] result = myLeetCode.intersect(nums1, nums2);
        Assert.assertArrayEquals(expect, result);
    }
    @Test
    public void findNumberIn2DArrayTest () {
        int matrix[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 20;
        boolean isFound = myLeetCode.findNumberIn2DArray(matrix, target);
        Assert.assertFalse(isFound);
    }
    @Test
    public void replaceSpaceTest() {
        String text = " 0 ";
        String newText = myLeetCode.replaceSpace(text);
        Assert.assertEquals(newText, "%20%20");
    }

    @Test
    public void fibTest() {
        int result = new Fib().fin(2);
        Assert.assertEquals(result, 1);
    }

}
