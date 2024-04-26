import java.util.Scanner;

public class ex224{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your 1st number: ");
    int num1 = input.nextInt();
    System.out.println("Please enter your 2nd number: ");
    int num2 = input.nextInt();
    System.out.println("Please enter your 3rd number: ");
    int num3 = input.nextInt();
    System.out.println("Please enter your 4th number: ");
    int num4 = input.nextInt();
    System.out.println("Please enter your 5th number: ");
    int num5 = input.nextInt();
    int largest = num1;
    int smallest = num1;

    if (num2 > largest) {
        largest = num2;
    }
    if (num3 > largest) {
        largest = num3;
    }
    if (num4 > largest) {
        largest = num4;
    }
    if (num5 > largest) {
        largest = num5;
    }

    if (num2 < smallest) {
      smallest = num2;
  }
  if (num3 < smallest) {
      smallest = num3;
  }
  if (num4 < smallest) {
      smallest = num4;
  }
  if (num5 < smallest) {
      smallest = num5;
  }

    System.out.printf("The largest number from five would be %d\n", largest);
    input.close();
    System.out.printf("The smallest number from five would be %d\n", smallest);
    input.close();
  }
}