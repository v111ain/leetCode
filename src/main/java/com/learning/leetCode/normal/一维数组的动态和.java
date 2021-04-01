package com.learning.leetCode.normal;

import java.util.Arrays;

public class 一维数组的动态和 {

    public static int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                sums[i] = nums[i];
                continue;
            }

            sums[i] = nums[i] + sums[i - 1];
        }
        return sums;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};

        Arrays.stream(runningSum(nums)).forEach(System.out::println);

    }

}
