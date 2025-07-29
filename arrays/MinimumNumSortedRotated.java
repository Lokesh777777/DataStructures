package arrays;

public class MinimumNumSortedRotated {

    public static int minNumber(int[] arr, int low, int high) {
        // If the array is not rotated
        if (arr[low] <= arr[high]) {
            return arr[low];
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is the minimum element
            if (arr[mid] < arr[mid - 1]) {
                return arr[mid];
            }

            // Check if mid+1 is the minimum element
            if (arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            }

            // Decide which half to choose for the minimum element search
            if (arr[mid] < arr[high]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1; // In case the array is empty or invalid
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
        int[] arr2 = {3, 4, 5, 1, 2};

        System.out.println(minNumber(arr1, 0, arr1.length - 1)); // Output: 1
        System.out.println(minNumber(arr2, 0, arr2.length - 1)); // Output: 1
    }
}
