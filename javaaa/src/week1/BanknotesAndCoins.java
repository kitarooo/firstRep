import java.util.Scanner;

public class BanknotesAndCoins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble() * 100;
        int m = (int) n;
        if (n > 0) {
            double[] balance = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00, 0.50, 0.25, 0.10, 0.5, 0.01};
            int[] balance2 = {100 * 100, 50 * 100, 20 * 100, 10 * 100, 5 * 100, 2 * 100, 100, 50, 25, 10, 5, 1};

            for (int i = 0; i < balance2.length; i++) {
                System.out.println("Notes: " + (m / balance2[i]) + " nota(s) de R$ " + balance[i]);
                m = m % balance2[i];
            }
        }
    }
}
