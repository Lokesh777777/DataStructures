package arrays;

import java.util.HashSet;

public class MergeTwoSortArr {
    public static HashSet<Integer> merged(int[] arr1, int[] arr2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for (int x : arr1) {
            set1.add(x);
        }
        for (int num : arr2) {
            if(!set1.contains(num)){
                result.add(num);
            }
        }
        for (Integer integer : set1) {
            result.add(integer);
        }
        return result;
    }
    public static int[] merge(int[] arr1, int[] arr2) {
        int l = arr1.length + arr2.length;
        int[] arr = new int[l];
        int i = 0, j = 0, k = 0;

        // Merge both arrays
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1
        while (i < arr1.length) {
            arr[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2
        while (j < arr2.length) {
            arr[k++] = arr2[j++];
        }

        return arr;
    }

    public static void main(String[] args) {
      //int[] result = merge(new int[]{1, 3, 5}, new int[]{2, 4, 6});
        int[] result = merge(new int[]{2, 3, 6}, new int[]{5,7,8});
        for (int x : result) {
            System.out.print(x + " ");
        }
        System.out.println();
        HashSet<Integer> res = merged(new int[]{1, 3, 5}, new int[]{2,4,6});
        System.out.println(res);
        HashSet<Integer> set = merged(new int[]{11, 13, 15}, new int[]{12,14});
        System.out.println(set);
    }
}
