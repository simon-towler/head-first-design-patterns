/*
 * One of several Displays.
 * Extends Observable to get changes from WeatherData
 * Implements DisplayElement because our API requires all displays to
 */
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  //store a ref to the Subject to facilitate un-registering from it
  Observable observable;

  /*
   * Our constructor now takes an Observable
   * and we use this to add the current conditions object as an Observer
   */
  public CurrentConditionsDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
  }

  /*
   * When update() is called we first save the temp and humidity,
   * then call display()
   */
  public void update(Observable obs, Object arg) {
    if (obs instanceof WeatherData) {
      WeatherData weatherData = (WeatherData)obs;
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      //in this simple example, on update() simply call display()
      display();
    }
  }

  public void display() {
    System.out.println("Current conditions: " + temperature
      + "F degrees and " + humidity + "% humidity");
  }
}
