public class ShuffleTheArray {
    public static void main(String[] args) {
//        Input: nums = [2,5,1,3,4,7], n = 3
//        Output: [2,3,5,4,1,7]

        int[] input = {2, 5, 1, 3, 4, 7};
        for (int i : shuffle(input,3)){
            System.out.print(i+",");
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length ];
        int counter = 0;
        for (int i = 0; i < n; i++) {

            result[counter] = nums[i];
            result[++counter] = nums[n + i];
            counter++;
        }
        return result;
    }
}
