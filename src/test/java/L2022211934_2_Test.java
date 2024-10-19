import org.example.Solution2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @description: 测试用例设计：
 * 1. 等价类划分：包括正常输入、边界值、重复字母等情况。
 * 2. 边界值分析：包括空字符串、长度为1的字符串等。
 * 3. 特殊情况：所有字符相同、包含所有字母、字典序递减等。
 */
//dev branch
//PRMergeTest
public class L2022211934_2_Test {

    Solution2 solution = new Solution2();

    /**
     * @description: 测试目的：验证普通情况，包括无重复字符和有重复字符的字符串。
     * 测试用例：
     * 1. 输入 "bcabc"，期望输出 "abc"
     * 2. 输入 "cbacdcbc"，期望输出 "acdb"
     */
    @Test
    public void testGeneralCases() {
        assertEquals("abc", solution.removeDuplicateLetters("bcabc"));
        assertEquals("acdb", solution.removeDuplicateLetters("cbacdcbc"));
    }

    /**
     * @description: 测试目的：验证边界情况，如空字符串和单字符字符串。
     * 测试用例：
     * 1. 输入 ""，期望输出 ""
     * 2. 输入 "a"，期望输出 "a"
     * 3. 输入 "z"，期望输出 "z"
     */
    @Test
    public void testEdgeCases() {
        assertEquals("", solution.removeDuplicateLetters(""));
        assertEquals("a", solution.removeDuplicateLetters("a"));
        assertEquals("z", solution.removeDuplicateLetters("z"));
    }

    /**
     * @description: 测试目的：验证所有字符相同的情况。
     * 测试用例：
     * 1. 输入 "aaaa"，期望输出 "a"
     * 2. 输入 "bbbbbbb"，期望输出 "b"
     */
    @Test
    public void testAllSameCharacters() {
        assertEquals("a", solution.removeDuplicateLetters("aaaa"));
        assertEquals("b", solution.removeDuplicateLetters("bbbbbbb"));
    }

    /**
     * @description: 测试目的：验证不同字符的顺序和重复的处理。
     * 测试用例：
     * 1. 输入 "abacabad"，期望输出 "abcd"
     * 2. 输入 "cbabcabc"，期望输出 "abc"
     */
    @Test
    public void testComplexCases() {
        assertEquals("abcd", solution.removeDuplicateLetters("abacabad"));
        assertEquals("abc", solution.removeDuplicateLetters("cbabcabc"));
    }

    /**
     * @description: 测试目的：验证边界情况和特殊字符。
     * 测试用例：
     * 1. 输入 "aabbccddeeff"，期望输出 "abcdef"
     * 2. 输入 "ababababab"，期望输出 "ab"
     */
    @Test
    public void testRepetitiveCharacters() {
        assertEquals("abcdef", solution.removeDuplicateLetters("aabbccddeeff"));
        assertEquals("ab", solution.removeDuplicateLetters("ababababab"));
    }
}

