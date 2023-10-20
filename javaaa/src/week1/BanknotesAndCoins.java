import java.util.Scanner;

public class BanknotesAndCoins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();

        if (n < 0) {
            double[] balance = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00, 0.50, 0.25, 0.10, 0.5, 0.01};
            for (double i : balance) {
                System.out.println("Notes: " + n / i + " nota(s) de R$ " + i);
                n = n % i;
            }
        }
    }
}
