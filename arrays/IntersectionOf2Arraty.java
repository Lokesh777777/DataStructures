package arrays;

import java.util.HashSet;

public class IntersectionOf2Arraty{
    public static HashSet<Integer> intersection(int [] arr1,int [] arr2){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for (int x : arr1) {
            set.add(x);
        }
        for(int num : arr2){
            if(set.contains(num)){
                result.add(num);
            }
        }
        return result;

    }
    public static void main(String[] args) {
        HashSet<Integer> result = intersection(new int[]{1,2,3,4,5}, new int[]{3,4,5,6,7});
        System.out.println(result);
    }
}