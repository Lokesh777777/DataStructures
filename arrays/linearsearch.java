package arrays;

public class linearsearch {
    public static void Linear(int [] arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                System.out.print(arr[i]+" "+"found at the index "+i);
            }

        }
    }
    public static void main(String[] args) {
        int [] arr = {2,7,8,5};
        Linear(arr,5);
        
    }
}
