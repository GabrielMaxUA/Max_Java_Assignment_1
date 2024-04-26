// 1. Create counter to 10
// 2. Find the largest numb from present ones
// 3. While counter is less than 10
//     a. ask to enter another number
//     b. get the numb from  input
//     c. If numb is greater than largest
//         i. Set largest to numb
//     d. Print the largest number so far
//     e. add 1 to counter 
// 4. Print the largest number
import java.util.Scanner;

public class ex421 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numb;
        int counter = 0;
        int largest = 0;
        

        while (counter < 10) {
            System.out.print("Enter a number: ");
            numb = input.nextInt(); 

            if (numb > largest) { 
                largest = numb; 
            }
            System.out.println("The largest number entered is: " + largest); 
            counter++; 
        }

        System.out.println("The largest number entered is: " + largest); 
        input.close();
    }
}
