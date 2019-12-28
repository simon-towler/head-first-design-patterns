/*
 * One of several Displays.
 * Implements Observer to get changes from WeatherData
 * Implements DisplayElement because our API requires all displays to
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  private Subject weatherData;

  /*
   * Constructor is passed the weatherData object (the Subject)
   * and we use it to register the display as an observer
   */
  public CurrentConditionsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  /*
   * When update() is called we first save the temp and humidity,
   * then call display()
   */
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }

  public void display() {
    System.out.println("Current conditions: " + temperature
      + "F degrees and " + humidity + "% humidity");
  }
}
