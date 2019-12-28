//initial misguided approach

public class WeatherData {
  //TODO instance variable declarations

  /*
   * This method gets called
   * whenever the weather measurements
   * have been updated
   */
  public void measurementsChanged() {
    // Your code goes here

    /*
     * Grab the most recent measurements
     * by calling the WeatherData's gettter
     * methods (already implemented)
     */
    float temp = getTemperature();
    float humidity = getHumidity();
    float pressure = getPressure();

    /*
     * Now update the displays...
     * Call each display element to update its display,
     * passing it the most recent measurements.
     */
    currentConditionsDisplay.update(temp, humidity, pressure);
    statisticsDisplay.update(temp, humidity, pressure);
    forecastDisplay.update(temp, humidity, pressure);
  }

  // other WeatherData methods here
}
