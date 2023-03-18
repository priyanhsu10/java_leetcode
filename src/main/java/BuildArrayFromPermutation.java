public class BuildArrayFromPermutation {
    public static void main(String[] args) {
 int[] input=  {0,2,1,5,3,4};
      int[]  Result= buildArray(input);
      for(int i:Result){
          System.out.println(i);
      }
    }

    public static int[] buildArray(int[] nums) {
  var reault =new int[6];
        for (int i=0 ;i<nums.length;i++){
            reault[i] =  nums[nums[i]]
;        }
        return  reault;
    }
}
