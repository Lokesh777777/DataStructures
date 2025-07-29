package arrays;
public class sec_largest {
    public static void main(String[] args) {
        int [] candy = {10,40,99,50};
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for(int num : candy){
            if(num>max){
                sec = max;
                max = num;
            }
            else if(num>sec && num != max){
                sec = num;
            }
        }
        System.out.println(max+","+sec);
    }
}
