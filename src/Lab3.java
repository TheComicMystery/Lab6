import java.util.Scanner;

public class Lab3 {
    public static void Lab3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter integer " + (i + 1) + ": ");
            int num = scanner.nextInt();
            sum += num;}
        System.out.println("Sym: " + sum);
    }
}