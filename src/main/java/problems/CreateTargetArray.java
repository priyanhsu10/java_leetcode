package problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class CreateTargetArray {
    public static void main(String[] args) {
       int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        for (int i :
                createTargetArray(nums,index)) {
            System.out.println(i);
        }
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] result=new int[nums.length];
        int current=0;
        for(int i= 0;i<nums.length;i++){

            if(i>index[i]){
                //shift array
                for(int j=nums.length-1;j>=index[i];j--)
                {
                    if(j==0){
                        continue;
                    }
                    result[j]=result[j-1];
                }
                result[index[i]]=nums[i];

                //set current index[i]
//                current=index[i];
            continue;
            }
            result[index[i]]=nums[i];
//            current=index[i];
        }
        return result;
    }
}
