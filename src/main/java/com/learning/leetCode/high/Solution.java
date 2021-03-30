package com.learning.leetCode.high;

/**
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 *
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 *
 * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * 输出：true
 *
 * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * 输出：false
 *
 * 执行用时：
 * 0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：37.7 MB, 在所有 Java 提交中击败了91.58%的用户
 *
 * TODO XXX: 使用二分查找法
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-a-2d-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class Solution {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int columnIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][columnIndex] > target) {
                columnIndex = i - 1;
                break;
            }else if(matrix[i][columnIndex] == target) {
                return true;
            }else if (matrix[i][columnIndex] < target && i == matrix.length - 1){
                columnIndex = matrix.length - 1;
            }
        }

        if (columnIndex < 0) {
            return false;
        }

        for (int i = 0; i < matrix[columnIndex].length; i++) {
            if (matrix[columnIndex][i] == target) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
//        int[][] matrix = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
//
//        System.out.println(searchMatrix(matrix, 3));

        int[][] matrix1 = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};

        System.out.println(searchMatrix(matrix1, 30));
    }

}
