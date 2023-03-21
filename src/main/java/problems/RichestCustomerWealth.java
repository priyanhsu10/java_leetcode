package problems;

import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        var accounts = new int[][]{{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(accounts));

    }

    public static int maximumWealth(int[][] accounts) {

        var max = Arrays.stream(accounts).mapToInt(x -> Arrays.stream(x).sum()).max().getAsInt();
        return max;
    }

}



