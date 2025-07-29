package arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static Set<Integer> removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        return set;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 10, 2, 4, 6, 7, 8, 8, 5, 6, 10};
        Set<Integer> result = removeDuplicates(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
