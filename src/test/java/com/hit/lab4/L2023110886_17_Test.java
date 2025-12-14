/**
 * 测试类：L2023110886_17_Test
 * 
 * 测试用例设计原则：
 * 1. 等价类划分原则：
 *    - 有重复的 DNA 序列的有效输入
 *    - 无重复序列的有效输入
 *    - 字符串长度小于 10 的无效输入（边界等价类）
 * 2. 边界值分析原则：
 *    - 刚好长度为 10 的字符串
 *    - 重复序列刚好出现 2 次的情况
 *    - 重复序列出现超过 2 次的情况
 */
package com.hit.lab4;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class L2023110886_17_Test {

    @Test
    public void testExample1() {
        Solution s = new Solution();
        List<String> result = s.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
        List<String> expected = Arrays.asList("AAAAACCCCC", "CCCCCAAAAA");
        assertTrue(result.containsAll(expected));
        assertEquals(999, result.size());
    }

    @Test
    public void testExample2() {
        Solution s = new Solution();
        List<String> result = s.findRepeatedDnaSequences("AAAAAAAAAAAAA");
        List<String> expected = Arrays.asList("AAAAAAAAAA");
        assertEquals(expected, result);
    }

    @Test
    public void testLengthLessThanTen() {
        Solution s = new Solution();
        List<String> result = s.findRepeatedDnaSequences("ACGT");
        assertTrue(result.isEmpty());
    }

    @Test
    public void testLengthEqualTen() {
        Solution s = new Solution();
        List<String> result = s.findRepeatedDnaSequences("ACGTACGTAC");
        assertTrue(result.isEmpty());
    }

    @Test
    public void testRepeatsMoreThanTwice() {
        Solution s = new Solution();
        List<String> result = s.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCAAAAACCCCC");
        List<String> expected = Arrays.asList("AAAAACCCCC", "CCCCCAAAAA");
        assertTrue(result.containsAll(expected));
    }
}
