public class Date {
  private int month; // Month part of the date
  private int day;   // Day part of the date
  private int year;  // Year part of the date

  // Constructor to initialize the Date object
  public Date( int day, int month, int year) {
      this.month = month;
      this.day = day;
      this.year = year;
  }

  // Setters and Getters for month, day, and year
  public void setMonth(int month) {
      this.month = month;
  }

  public int getMonth() {
      return month;
  }

  public void setDay(int day) {
      this.day = day;
  }

  public int getDay() {
      return day;
  }

  public void setYear(int year) {
      this.year = year;
  }

  public int getYear() {
      return year;
  }

  public void showDate() {
      System.out.printf("%d/%d/%d\n", day, month, year);
  }
}