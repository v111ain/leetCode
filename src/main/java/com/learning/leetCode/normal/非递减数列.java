package com.learning.leetCode.normal;

/**
 * 给你一个长度为n的整数数组，请你判断在 最多 改变1 个元素的情况下，该数组能否变成一个非递减数列。
 *
 * 我们是这样定义一个非递减数列的：对于数组中任意的i (0 <= i <= n-2)，总满足 nums[i] <= nums[i + 1]。
 *
 * 示例 1:
 * 输入: nums = [4,2,3]
 * 输出: true
 * 解释: 你可以通过把第一个4变成1来使得它成为一个非递减数列。
 *
 * 示例 2:
 * 输入: nums = [4,2,1]
 * 输出: false
 * 解释: 你不能在只改变一个元素的情况下将其变为非递减数列。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/non-decreasing-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 非递减数列 {

    public static boolean checkPossibility(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                count++;
                if (count > 1) {
                    return false;
                }

                if (i > 0 && nums[i + 1] < nums[i - 1]) {
                    nums[i + 1] = nums[i];
                }

            }

        }

        return true;
    }


    public static void main(String[] args) {

        int[] nums = {3,4,2,3};
        System.out.println(checkPossibility(nums));;

    }


}
