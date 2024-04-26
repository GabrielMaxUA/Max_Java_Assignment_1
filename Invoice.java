
public class Invoice {
  private String partNumber;
  private String partDescribtion;
  private int quantity;
  private double price;

  public Invoice(String partNumber, String partDescribtion, int quantity, double price){
    this.partNumber = partNumber;
    this.partDescribtion = partDescribtion;
    this.quantity = quantity;
    this.price = price;
  }

  public String getPartNumber(){
    return partNumber;
  }
  public void setPartNumber(String partNumber){
    this.partNumber = partNumber;
  }

  public String getPartDescribtion(){
    return partDescribtion;
  }
  public void setPartDescribtion(String partDescribtion){
    this.partDescribtion = partDescribtion;
  }

  public void setQuantity(int quantity){
    if(quantity > 0){
      this.quantity = quantity;
    }
    else{
      this.quantity = 0;
    }
  }

  public int getQuantity(){
    return quantity;
  }

  public void setPrice(double price){
    if(price > 0){
      this.price = price;
    }
    else{
      this.price = 0.0;
    }
  }

  public double getPrice(){
    return this.price;
  }

  public double getInvoiceAmount(){
    double total = quantity * price;
    return total;
  }
}
