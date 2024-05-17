// package Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int prev = 0, curr = 1, next;
        System.out.println("Fiobonacci Series of 10 items:");
        System.out.print(prev + " ");
        System.out.print(curr + " ");
        for (int i = 1; i <= 10 - 2; i++) {
            next = prev + curr;
            prev = curr;
            curr = next;
            System.out.print(next + " ");
        }
    }
}
