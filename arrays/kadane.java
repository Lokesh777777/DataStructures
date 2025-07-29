package arrays;
public class kadane {
        // arr: input array
        // Function to find the sum of contiguous subarray with maximum sum.
        int maxSubarraySum(int[] arr) {
            int max = arr[0];
            int current = arr[0];
            for(int i=1; i<arr.length; i++){
                current = Math.max(arr[i],current+arr[i]);
                max = Math.max(current,max);
            }
            return max;
        }
    }
    /* 
    
    Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
    Output: 11
    Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.

    Input: arr[] = [-2, -4]
    Output: -2
    Explanation: The subarray {-2} has the largest sum -2.

    Input: arr[] = [5, 4, 1, 7, 8]
    Output: 25
    Explanation: The subarray {5, 4, 1, 7, 8} has the largest sum 25.

    */