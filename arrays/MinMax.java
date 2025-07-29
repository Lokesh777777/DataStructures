package arrays;

public class MinMax {
    public static void main(String[] args) {
        int [] arr = {4,3,2,1,6,7};
        int min=arr[0],max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Minimum "+min+" Maximum "+max);
    }
}
