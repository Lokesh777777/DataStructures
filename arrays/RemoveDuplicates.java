package arrays;
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int length = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5};
        int length = removeDuplicates(nums);
        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nNew length: " + length);
    }
}
