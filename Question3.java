import java.util.HashMap;
import java.util.Stack;

public class Question3 {
    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i <= nums.length - 1; i++) {
            System.out.println("i " + i);
            System.out.println();
            for (int j = i + 1; j <= nums.length - 1; j++) {
                System.out.println("j - " + j);
                System.out.println();
                if (nums[i] + nums[j] == target) {
                    System.out.println("i " + i);
                    System.out.println("j " + j);
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return answer;
    }

    public int[] twoSumHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] testCaseOne = { 3, 2, 4 };
        int[] testCaseTwo = { 2, 5, 5, 11 };
        int[] testCaseThree = { 1, 74, 5, 93, 4, 7, 4 };
        int[] testCaseFour = { 3, 65, 32, 4, 11, 123, 76, 4 };

        for (int number : twoSum(testCaseTwo, 10)) {
            System.out.print(" " + number);
        }

        // System.out.println(twoSum(testCaseTwo, 6));
        // System.out.println(twoSum(testCaseThree, 65));
        // System.out.println(twoSum(testCaseFour, 6));
    }
}
