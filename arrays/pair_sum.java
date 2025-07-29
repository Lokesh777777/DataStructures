package arrays;

import java.util.*;
public class pair_sum{
    public static void main(String[] args) {
        int [] arr = {3,4,5,9,10,2};
        int target = 6;
        Set<Integer> set = new HashSet<>();

        for(int x:arr){
            if(set.contains(target - x)){  //6-3=3,6-4=2,6-5=1,6-9=-3,6-10=-4,6-2=4(contains in set)
                System.out.println(x+","+(target-x));
                                 //2  ,    4
            }
            set.add(x); //1-(3), 2-(3,4), 3-(3,4,5), 4-(3,4,5,9), 5-(3,4,5,9,10)
    }
}
}