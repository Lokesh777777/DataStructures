package Recursion;

public class Factorial {
    public static int Fact( int n){
        if(n==2){
            return 1;
        }
        return n*Fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(Fact(5));
    }
}
