import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say what lab work you want to see, and you will see");
        int N = scanner.nextInt();
        switch (N) {
            case 1 -> Lab1.Lab1(args);
            case 2 -> Lab2.Lab2(args);
            case 3 -> Lab3.Lab3(args);
            case 4 -> Lab4.Lab4(args);
            case 5 -> Lab5.Lab5(args);
            case 6 -> Lab6.Lab6(args);
        }
    }
}