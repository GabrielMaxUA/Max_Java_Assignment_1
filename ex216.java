// 2.16 (Comparing Integers) Write an application that asks the user to
//  enter two integers, obtains them from the user and displays the 
//  larger number followed by the words "is larger".
//   If the numbers are equal, print the message 
//   "These numbers are equal".
import java.util.Scanner;

public class ex216 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your first integer: ");
    int num1 = input.nextInt();
    System.out.println("Please enter your second integer: ");
    int num2 = input.nextInt();
    if(num1 < num2){
      System.out.printf("%d is larger \n", num2);
      }
      else if(num1 > num2){
        System.out.printf("%d is larger \n", num1);
      }
      else{
        System.out.println("These numbers are equal");
      }
    input.close();
  }
}