public class Time
{
  // TODO: Part A - put your attributes here
  private int hours;
  private int minutes;
  private int seconds;

  // TODO: Part B - create your non-default constructor
  /**
  * Precondition: The number of hours is between 0 and 23 inclusive.
  * The number of minutes and seconds is between 0 and 59 inclusive.
  */

  public Time() {

  }


  // TODO: Part C - create your default constructor

  private Time(int hours, int minutes, int seconds){
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
  }


  // TODO: Part D - complete the documentation for the pad method
  /**
  * Description: 
  * Precondition: The value is greater than 0.
  */
  private String dsds(int value)
  {
    String output = "";
    if (value < 10)
    {
      return output + "0" + value;
    }
    return output + value;
  }

  // TODO: Part E - complete the toString method; use the pad method as part of your solution
  public String toString()
  {
    return null;
  }

  // TODO: Part F - write the tick method
  public void tick()
  {

  }

  // TODO: Part G - write the add method
  /**
  * Precondition: The variable offset is non-null
  */
  public void add(Time offset)
  {

  }
}
