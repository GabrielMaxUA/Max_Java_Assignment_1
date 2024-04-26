// 2.17 (Arithmetic, Smallest and Largest) Write an application 
// that inputs three integers from the user and displays 
// the sum, average, product, smallest and largest of the numbers. 
import java.util.Scanner;

public class ex217 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your first integer: ");
    int num1 = input.nextInt();
    System.out.println("Please enter your first integer: ");
    int num2 = input.nextInt();
    System.out.println("Please enter your first integer: ");
    int num3 = input.nextInt();
    // sum, 
    System.out.printf("The sum of your numbers will be: %s\n", num1 + num2 + num3);
    // average, product, smallest and largest
    System.out.printf("The product of your numbers will be: %s\n", num1 * num2 * num3);
    System.out.printf("The average of your numbers will be: %d\n", (num1 + num2 + num3) / 3);
    
    if (num1 >= num2 && num1 >= num3) {
      System.out.printf("The largest number is: %d\n", num1);
  } else if (num2 >= num1 && num2 >= num3) {
      System.out.printf("The largest number is: %d\n", num2);
  } else {
      System.out.printf("The largest number is: %d\n", num3);
  }

  if (num1 <= num2 && num1 <= num3) {
    System.out.printf("The smallest number is: %d\n", num1);
} else if (num2 <= num1 && num2 <= num3) {
    System.out.printf("The smallest number is: %d\n", num2);
} else {
    System.out.printf("The smallest number is: %d\n", num3);
}
      input.close();
  }
}
