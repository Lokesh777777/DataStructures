package arrays;

public class binarySearch {
    //with array and key only
    public static int findPosition(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == k) {
                result = mid;
                right = mid - 1; // Continue searching in the left half to find the smallest index
            } else if (arr[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static int Binary(int[] arr,int target,int low,int high){
        int mid = (low+high)/2;
        while(low<high){
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                return Binary(arr, target,low-1,high);
            }
            else {
                return Binary(arr, target, low, high+1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(Binary(new int[]{1,2,3,4,5,6,7,8,9},5,0,8));
    }
}
