package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicates {
    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            if(!set.add(num)){
                list.add(num);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        List<Integer> a = findDuplicates(new int[]{2,3,1,2,2,3});
        System.out.println(a);
    }
}

/*
 * Complexity
Time Complexity:

Adding to a HashSet takes O(1) on average.
Iterating over the array takes O(n).
Total: O(n).
Space Complexity:

HashSet and ArrayList both require additional space proportional to the input size.
Space: O(n).

 */
