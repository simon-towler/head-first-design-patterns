// WeatherData now implements the Subject interface
public class WeatherData implements Subject {
  //We've added a List to hold the observers
  private List<Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  //initialise the List of Observers in the constructor
  public WeatherData() {
    observers = new ArrayList<Observer>();
  }

  //implement the Subject interface
  public void registerObserver(Observer o) {
    observers.add(o);
  }
  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);
    if (i >= 0) {
      observers.remove(i);
    }
  }
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(temperature, humidity, pressure);
    }
  }

  /*
   * This method gets called
   * whenever the weather measurements
   * have been updated
   */
  public void measurementsChanged() {
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
}
