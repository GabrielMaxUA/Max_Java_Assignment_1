import java.util.Scanner;
public class ex225{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your integer: ");
    int num = input.nextInt();
    if(num%2 == 0){
      System.out.println("The number you gave is an even number ");
    }
    else {
      System.out.println("The number you provided is an odd number ");
    }
    input.close();
  }
}