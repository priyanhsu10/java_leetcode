package problems;

public class FinalValueOfVariable {
    public static void main(String[] args) {
        String[] input = {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(input));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String s : operations) {
            result = s.contains("+") ? ++result : --result;
        }
        return result;
    }
}
