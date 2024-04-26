
public class Employee {
  private String firstName;
  private String lastName;
  private Double mounthlySalary;

  public Employee(String firstName, String lastName, Double mounthlySalary){
    this.firstName = firstName;
    this.lastName = lastName;
    setMonthlySalary(mounthlySalary);
  }

  //getters
  public String getFirstName(){
    return firstName;
  }

  public String getSecondName(){
    return lastName;
  }

  public Double getMonthlySalary(){
    return mounthlySalary;
  }

  //setters
  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public void setlastName(String lastName){
    this.lastName = lastName;
  }

  public void setMonthlySalary(Double mounthlySalary){
    if(mounthlySalary > 0.0){
      this.mounthlySalary = mounthlySalary;
    }
    else{
      this.mounthlySalary = null;
    }
  }
}