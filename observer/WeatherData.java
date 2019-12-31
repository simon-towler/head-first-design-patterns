import java.util.*;

// WeatherData now extends Observable
public class WeatherData extends Observable {
  //We've added a List to hold the observers
  private float temperature;
  private float humidity;
  private float pressure;

  //initialise the List of Observers in the constructor
  public WeatherData() {
    //constructor no longer needs to create a data structure to hold observers
  }

  /*
   * This method gets called
   * whenever the weather measurements
   * have been updated
   */
  public void measurementsChanged() {
    setChanged();
    notifyObservers();
  }

  /*
   * Use this method to simulate new data coming from a weather station
   * to test our display elements
   */
  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  /*
   * Because we are going to use "Pull" the observers will use these methods
   * to get at the WeatherData object's state
   */
   public float getTemperature() {
     return temperature;
   }
   public float getHumidity() {
     return humidity;
   }
   public float getPressure() {
     return pressure;
   }
}
