public class ConcatenationOfArray {
    public static void main(String[] args) {
 int[] input={1,2,1};
 for(int i:getConcatenation(input)){
     System.out.println(i);
 }
    }

    public static int[] getConcatenation(int[] nums) {

        int[] result = new int[nums.length*2];
        int l=nums.length;

        for(int i=0;i<l;i++){
            result[i]=nums[i];
            result[l+i]=nums[i];
        }
        return  result;
    }
}
