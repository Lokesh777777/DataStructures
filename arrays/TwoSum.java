package arrays;

import java.util.HashMap;

public class TwoSum {
    public static boolean twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (numMap.containsKey(complement)) {
                return true;
            }
            numMap.put(arr[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2,7,9,10,1,3,4},10));
    }
}
