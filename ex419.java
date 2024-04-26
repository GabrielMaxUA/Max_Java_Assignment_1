import java.util.Scanner;

public class ex419 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] itemPrices = {239.99, 129.75, 99.95, 350.89};
        double totalSales = 0;

        for (int i = 0; i < itemPrices.length; i++) {
            System.out.printf("Enter the number of the %dst item you sold: ", i + 1);
            int quantity = input.nextInt();
            totalSales += quantity * itemPrices[i];
        }
        double salary = 200 + (totalSales * 0.09);

        System.out.printf("Total sales amount: $%.2f\n", totalSales);
        System.out.printf("Total salary: $%.2f\n", salary);
        input.close();
    }
}
