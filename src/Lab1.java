import java.util.Scanner;

public class Lab1 {
    public static void Lab1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the exchange rate: ");
        double rate = scanner.nextDouble();
        System.out.println("USD  |  UAH");
        for (int i = 1; i <= 10; i++) {
            double UAH = i * rate;
            System.out.println(i + "       |  " + UAH);
        }
    }
}