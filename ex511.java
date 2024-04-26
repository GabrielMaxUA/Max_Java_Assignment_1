import java.util.Scanner;

public class ex511 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of integers you want to go through: ");
        int count = input.nextInt();

        if (count <= 0) {
            System.out.println("Please enter a positive number.");
            input.close();
            return;
        }

        System.out.print("Enter the first number: ");
        int smallest = input.nextInt();  

        for (int i = 1; i < count; i++) { 
            System.out.printf("Enter your %d number of %d: ", i + 1, count);
            int number = input.nextInt();

            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("The smallest number you entered is: " + smallest);

        input.close();
    }
}
