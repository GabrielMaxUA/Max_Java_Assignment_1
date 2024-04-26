public class ex313 {
  public static void main(String[] args) {
    Employee max = new Employee("Max", "Gabriel", -1278.91);
    Employee micky = new Employee("Mickey", "Gonsales", 1234.98);
    System.out.println(max.getFirstName() + " " + max.getSecondName());
    if(max.getMonthlySalary() != null){
      System.out.println("\n" + max.getFirstName() + "'s monthly salary is: $" + max.getMonthlySalary());
      System.out.printf("Annual salary of Max is: $%.2f\n" , (max.getMonthlySalary()  * 12));
      System.out.printf("Annual salary of Max after increase of 10%% is: $%.2f\n", 
      (max.getMonthlySalary() + ((max.getMonthlySalary() * 10))/100) * 12);
    }
    else{
      System.out.println("\nMax's salary is below zero...Max needs to speak to his employer for salary increase. \n");
    }

    System.out.println("\n" + micky.getFirstName() + " " + micky.getSecondName());
    if(micky.getMonthlySalary() != null){
      System.out.println("\n" + micky.getFirstName() + "'s monthly salary is: " + micky.getMonthlySalary());
      System.out.printf("Annual salary of Micky is: $%.2f\n" , (micky.getMonthlySalary()  * 12));
      System.out.printf("Annual salary of Micky after increase of 10%% is: $%.2f\n", 
      (max.getMonthlySalary() + ((micky.getMonthlySalary() * 10))/100) * 12);
    }
    else{
      System.out.println("Micky's salary is below zero...Max needs to speak to his employer for salary increase\n");
    }
    
  }
}
