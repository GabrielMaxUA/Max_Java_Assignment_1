
public class ex312 {
  public static void main(String[] args) {

    Invoice max = new Invoice("123SAF", "hummer-drill", 9, 234.45);
   
    System.out.println("Part number: " + max.getPartNumber());
    System.out.println("Part describtion: " + max.getPartDescribtion());
    System.out.println("Purchasing quantity of: " + max.getQuantity());
    System.out.println("Price: $" + max.getPrice());
    System.out.printf("Your invoice would be: $%.2f\n", max.getInvoiceAmount());
  }
}
