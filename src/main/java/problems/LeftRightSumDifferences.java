package problems;

import java.util.Arrays;

public class LeftRightSumDifferences {
    public static void main(String[] args) {
        var nums = new int[]{10, 4, 8, 3};
        leftRigthDifference(nums);

    }

    public static int[] leftRigthDifference(int[] nums) {
        //implement
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = sum(nums, i, nums.length);
        }
        Arrays.stream(result).forEach(System.out::println);
        return result;
    }

    static int  sum(int[] ar, int index, int length) {
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < index; i++) {
            leftSum += ar[i];
        }
        System.out.println("left:"+leftSum);
        for (int i = length-1; i > index; i--) {
            rightSum += ar[i];
        }
        System.out.println("right:"+rightSum);
        return Math.abs( leftSum - rightSum);

    }
}
