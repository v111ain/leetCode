package com.learning.leetCode.high;


import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
 *
 * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。
 *
 *
 * 示例 1：
 * 输入：nums = [1,2,2]
 * 输出：[[],[1],[1,2],[1,2,2],[2],[2,2]]
 *
 * 示例 2：
 * 输入：nums = [0]
 * 输出：[[],[0]]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/subsets-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 子集2 {

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>(nums.length * 2);
        list.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            ArrayList<Integer> data1 = null;
            while (j < nums.length) {
                if (data1 == null) {
                    data1 = new ArrayList<>();
                    data1.add(nums[i]);
                    if (j+1 >= nums.length) {
                        list.add(data1);
                        break;
                    }
                }else {
                    data1 = new ArrayList<>(data1);
                    data1.add(nums[j + 1]);
                    if (++j+1 >= nums.length) {
                        list.add(data1);
                        break;
                    }
                }

                list.add(data1);
            }

            System.out.println(list.toString());
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println(subsetsWithDup(nums).toString());

    }

}
