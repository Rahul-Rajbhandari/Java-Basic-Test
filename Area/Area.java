// package Area;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length and width");
        float length = scanner.nextFloat();
        float width = scanner.nextFloat();
        float area = length * width;
        System.out.println(area);
    }
}
