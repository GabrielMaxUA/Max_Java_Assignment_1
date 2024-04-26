public class ex314 {
  public static void main(String[] args) {
      Date date = new Date(4, 11, 1985);
      System.out.printf("Todays is the %sth day of the month\n", date.getDay());
      System.out.printf("This month is the %sth month of the year\n", date.getMonth());
      System.out.printf("Today is the year of %s \n", date.getYear());
      date.showDate();
  }
}
