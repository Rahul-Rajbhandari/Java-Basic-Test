
// package SimpleInterest;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long principal, interest, time, result;
        System.out.println("Enter principal, interest and time");
        principal = scanner.nextLong();
        interest = scanner.nextLong();
        time = scanner.nextLong();
        result = (principal * time * interest) / 100;
        System.out.println("Simple Interest is " + result);
    }
}
