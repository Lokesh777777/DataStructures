package Recursion;
public class Fibonacci {

    // Recursive method to compute nth Fibonacci number
    public static int fib(int n) {
        if (n == 0) {
            return 0; // Base case 1
        }
        if (n == 1) {
            return 1; // Base case 2
        }
        // Recursive call: sum of the two preceding numbers
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 6; // Change this value to test other inputs
        int result = fib(n);
        System.out.println("Fibonacci number at position " + n + " is " + result);
    }
}
