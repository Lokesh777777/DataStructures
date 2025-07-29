package arrays;

public class findingthemissingnumber{
    public static void LargeApproach(){
        int [] arr = {2,3,5,6,7,8,9,10,1};
        int n = arr.length + 1; // Total numbers including the missing one
        int xorAll = 0, xorArr = 0;   

        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xorAll ^= i;              
        }

        // XOR all elements in the array
        for (int num : arr) {
            xorArr ^= num;      
        }

        // The missing number is the XOR of the two results
        System.out.println(xorAll ^ xorArr); 
        //Missing Number = xorAll⊕xorArr = (1⊕2⊕3⊕4⊕5)⊕(1⊕2⊕3⊕5)=4
       // This approach is linear 𝑂(𝑛) and space-efficient 𝑂(1).
    }
    public static void main(String[] args) {
       int [] arr = {3,5,1,4,2,7}; //6
       int n = arr.length+1; //7 for the missing value
       int sum = n*(n+1)/2; // mathematical approach
       for (int i : arr) { // looping one by one, subtracting the sum
        sum = sum - i;
       }
       System.out.println(sum);
       LargeApproach();

    }
}