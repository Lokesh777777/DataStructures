package arrays;

import java.util.Scanner;

public class SubArraySum {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\nenter the target: ");
            int target = scanner.nextInt();
            SubArray(arr, target);
        }
        SubArray(new int[]{1,2,3,4,5}, 10);
    }

    public static void SubArray(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int x = target; // Reset x to target for each new starting index
            for (int j = i; j < arr.length; j++) {
                x -= arr[j];
                if (x == 0) {
                    System.out.println((i + 1) + " " + (j + 1));
                    break; // Exit the inner loop once the subarray is found
                }
            }
        }
    }
}
