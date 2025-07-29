package arrays;

import java.util.HashMap;

public class CountFrequency {
    public static void Frequency(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x:arr){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for (int i : map.keySet()) {
            System.out.println(i+"->"+map.get(i));
        }
    }
    public static void main(String[] args) {
    Frequency(new int[]{1,2,2,3,4,4,4,5});
    }
}
