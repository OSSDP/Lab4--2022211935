import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testRemoveDuplicateLetters() {
        Solution2 solution = new Solution2();

        // 测试数据点
        String input1 = "bcabc";
        String expectedOutput1 = "abc";

        String input2 = "cbacdcbc";
        String expectedOutput2 = "acdb";

        String input3 = "";
        String expectedOutput3 = "";

        String input4 = "aabbcc";
        String expectedOutput4 = "abc";

        // 执行测试
        assertEquals(expectedOutput1, solution.removeDuplicateLetters(input1));
        assertEquals(expectedOutput2, solution.removeDuplicateLetters(input2));
        assertEquals(expectedOutput3, solution.removeDuplicateLetters(input3));
        assertEquals(expectedOutput4, solution.removeDuplicateLetters(input4));

        // 添加更多的测试用例来确保代码的健壮性
    }
}
