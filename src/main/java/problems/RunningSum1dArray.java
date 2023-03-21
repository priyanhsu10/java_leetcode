package problems;

import java.util.HashMap;
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//        Return the running sum of nums.
//
//
//
//        Example 1:
//
//        Input: nums = [1,2,3,4]
//        Output: [1,3,6,10]
//        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
//        Example 2:
//
//        Input: nums = [1,1,1,1,1]
//        Output: [1,2,3,4,5]
//        Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
//        Example 3:
//
//        Input: nums = [3,1,2,10,1]
//        Output: [3,4,6,16,17]
//
//
//        Constraints:
//
//        1 <= nums.length <= 1000
//        -10^6 <= nums[i] <= 10^6
public class RunningSum1dArray {
    public static void main(String[] args) {

       int [] nums =new int[]{1,2,3,4};
       for (int i:runningSum(nums)){
           System.out.println(i);
       }
    }
    public  static int[] runningSum(int[] nums) {
        var map = new HashMap<Integer,Integer>();
        int [] runningSum = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            runningSum[i]= sum(i,nums,map);
        }
        return runningSum;
    }

    private static int sum(int index, int[] nums, HashMap<Integer, Integer> map) {

        if(index==0){
            map.put(index,nums[index]);
            return  nums[index];
        }
       int sum=map.get(index-1)+nums[index];
        map.put(index,sum);
        return sum;
    }
}
