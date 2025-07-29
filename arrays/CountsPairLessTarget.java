package arrays;
import java.util.Arrays;
public class CountsPairLessTarget {
    static int countPairs(int arr[], int target) {
            if (arr == null || arr.length < 1) return 0;
            int pairs = 0;
            Arrays.sort(arr);  // Sort the array first
            int left = 0, right = arr.length - 1;
            
            while (left < right) {
                if (arr[left] + arr[right] < target) {
                    // If the sum of arr[left] and arr[right] is less than target, 
                    // all pairs with left and any element between left and right will be valid
                    pairs += (right - left);
                    left++;  // Move left pointer to the right
                } else {
                    right--;  // Move right pointer to the left
                }
            }
            
            return pairs;
        }
        public static void main(String[] args) {
            int result = countPairs(new int[]{7,2,3,5,1},8);
            System.out.println(result);
    }
}
/*
 * Full Example Walkthrough:
Input: arr = [8, 2, 4, 1], target = 7

Sort the Array: arr = [1, 2, 4, 8]
Initialize Pointers: left = 0, right = 3

Iteration 1:
arr[left] + arr[right] = 1 + 8 = 9 (not valid)
Move right--: right = 2

Iteration 2:
arr[left] + arr[right] = 1 + 4 = 5 (valid)
Add pairs: pairs += (2 - 0) = 2
Move left++: left = 1

Iteration 3:
arr[left] + arr[right] = 2 + 4 = 6 (valid)
Add pairs: pairs += (2 - 1) = 1
Move left++: left = 2

End: left >= right, stop loop.
Output: pairs = 3


 */
