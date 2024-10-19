package org.example;

/**
 * @description:
 *
 * 给你一个字符串 s ，请你去除字符串中重复的字母，使得每个字母只出现一次。需保证 返回结果的字典序最小（要求不能打乱其他字符的相对位置）。
 *
 *
 * 示例 1：
 *
 * 输入：s = "bcabc"
 * 输出："abc"
 * 示例 2：
 *
 * 输入：s = "cbacdcbc"
 * 输出："acdb"
 *
 * 1 <= s.length <= 104
 * s 由小写英文字母组成
 */
public class Solution2 {
    public String removeDuplicateLetters(String s) {
        boolean[] vis = new boolean[26];
        int[] num = new int[26];
        for (int i = 0; i < s.length(); i++) {
            num[s.charAt(i) - 'a']++;
        }

        StringBuffer sb = new StringBuffer();
        // 遍历字符串
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // 每遍历一个字符，减去它的数量
            num[ch - 'a']--;

            // 如果字符已经在结果中，跳过
            if (vis[ch - 'a']) {
                continue;
            }

            // 贪心算法，保持字典序最小
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) > ch) {
                // 如果栈顶元素后面还会出现，则可以弹出
                if (num[sb.charAt(sb.length() - 1) - 'a'] > 0) {
                    vis[sb.charAt(sb.length() - 1) - 'a'] = false;  // 标记为不在栈中
                    sb.deleteCharAt(sb.length() - 1);  // 弹出栈顶元素
                } else {
                    break;  // 如果栈顶元素不会再出现，直接退出
                }
            }

            // 将当前字符入栈并标记
            sb.append(ch);
            vis[ch - 'a'] = true;
        }
        return sb.toString();
    }
}

